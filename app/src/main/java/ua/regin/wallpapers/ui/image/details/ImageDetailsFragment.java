package ua.regin.wallpapers.ui.image.details;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

import ua.regin.wallpapers.R;
import ua.regin.wallpapers.entity.ImageResponse;
import ua.regin.wallpapers.ui.BaseFragment;

@EFragment(R.layout.fragment_image_details)
public class ImageDetailsFragment extends BaseFragment {

    @FragmentArg
    protected ImageResponse imageResponse;

    @ViewById
    protected ImageView imageView;

    @AfterViews
    protected void afterViews() {
        Picasso.with(getContext()).load(imageResponse.getImage().getPreview().getUrl()).fit().centerCrop().into(imageView);
    }
}
