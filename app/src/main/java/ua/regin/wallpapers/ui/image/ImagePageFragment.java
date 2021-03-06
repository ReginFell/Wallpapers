package ua.regin.wallpapers.ui.image;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import ua.regin.wallpapers.R;
import ua.regin.wallpapers.application.Application;
import ua.regin.wallpapers.entity.ImageResponse;
import ua.regin.wallpapers.manager.IImageManager;
import ua.regin.wallpapers.ui.image.adapter.ImageAdapter;
import ua.regin.wallpapers.ui.image.details.ImageDetailsPagerFragment_;
import ua.regin.wallpapers.ui.navigation.impl.BaseNavigableFragment;

@EFragment(R.layout.fragment_image_page)
@OptionsMenu(R.menu.menu_shufle)
public class ImagePageFragment extends BaseNavigableFragment implements ImageAdapter.Callbacks {

    @Inject
    protected IImageManager imageManager;

    @ViewById
    protected Toolbar toolbar;

    @ViewById
    protected RecyclerView recyclerView;

    private ImageAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application.getApplication().getAppComponent().inject(this);
    }

    @AfterViews
    protected void afterViews() {
        getNavigableActivity().setToolbar(toolbar, R.string.image_fragment_title);

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new ImageAdapter(getContext(), this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        imageManager.getImageList().compose(bindToLifecycle()).subscribe(this::updateImageData, this::handleError);
    }

    private void updateImageData(List<ImageResponse> imageList) {
        adapter.setImageList(imageList);
    }

    @Override
    public void onClick(ImageResponse imageResponse) {
        getNavigableActivity().switchFragmentInternal(ImageDetailsPagerFragment_.builder().build());
    }
}
