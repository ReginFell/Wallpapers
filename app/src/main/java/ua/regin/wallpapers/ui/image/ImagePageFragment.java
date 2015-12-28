package ua.regin.wallpapers.ui.image;

import android.support.v7.widget.Toolbar;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

import ua.regin.wallpapers.R;
import ua.regin.wallpapers.ui.BaseFragment;

@EFragment(R.layout.fragment_image_page)
@OptionsMenu(R.menu.menu_shufle)
public class ImagePageFragment extends BaseFragment {

    @ViewById
    protected Toolbar toolbar;

    @AfterViews
    protected void afterViews() {
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.setToolbar(toolbar, R.string.image_fragment_title);
    }
}
