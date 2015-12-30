package ua.regin.wallpapers.ui.navigation;

import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;

public interface INavigationActivity {

    void switchFragment(Fragment fragment);

    void switchFragmentInternal(Fragment fragment);

    void setToolbar(Toolbar toolbar, int titleId);

    INavigationActivity getNavigableActivity();
}
