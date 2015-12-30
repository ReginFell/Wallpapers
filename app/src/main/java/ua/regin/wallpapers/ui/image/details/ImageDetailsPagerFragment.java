package ua.regin.wallpapers.ui.image.details;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.xgc1986.parallaxPagerTransformer.ParallaxPagerTransformer;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.List;

import javax.inject.Inject;

import ua.regin.wallpapers.R;
import ua.regin.wallpapers.application.Application;
import ua.regin.wallpapers.entity.ImageResponse;
import ua.regin.wallpapers.manager.IImageManager;
import ua.regin.wallpapers.ui.image.details.adapter.PagerAdapter;
import ua.regin.wallpapers.ui.navigation.impl.BaseNavigableFragment;

@EFragment(R.layout.fragment_image_details_pager)
public class ImageDetailsPagerFragment extends BaseNavigableFragment {

    @Inject
    protected IImageManager imageManager;

    @ViewById
    protected Toolbar toolbar;

    @ViewById
    protected ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application.getApplication().getAppComponent().inject(this);
    }

    @AfterViews
    protected void afterViews() {
        getNavigableActivity().setToolbar(toolbar, R.string.image_fragment_title);
        imageManager.getImageList().compose(bindToLifecycle()).subscribe(this::updatePages, this::handleError);
    }

    private void updatePages(List<ImageResponse> imageResponseList) {
        PagerAdapter adapter = new PagerAdapter(getChildFragmentManager(), imageResponseList);
        viewPager.setPageTransformer(false, new ParallaxPagerTransformer(R.id.imageView));
        viewPager.setAdapter(adapter);
    }
}
