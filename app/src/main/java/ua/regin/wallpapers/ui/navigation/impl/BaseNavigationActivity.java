package ua.regin.wallpapers.ui.navigation.impl;

import android.support.v4.app.Fragment;

import ua.regin.wallpapers.R;
import ua.regin.wallpapers.ui.BaseActivity;
import ua.regin.wallpapers.ui.navigation.INavigationActivity;

public abstract class BaseNavigationActivity extends BaseActivity implements INavigationActivity {

    @Override
    public void switchFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }

    @Override
    public void switchFragmentInternal(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public INavigationActivity getNavigableActivity() {
        return this;
    }
}
