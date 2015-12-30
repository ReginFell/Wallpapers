package ua.regin.wallpapers.ui.navigation.impl;

import ua.regin.wallpapers.ui.BaseFragment;
import ua.regin.wallpapers.ui.navigation.INavigableFragment;
import ua.regin.wallpapers.ui.navigation.INavigationActivity;

public abstract class BaseNavigableFragment extends BaseFragment implements INavigableFragment {

    @Override
    public INavigationActivity getNavigableActivity() {
        if (getActivity() instanceof INavigationActivity) {
            return (INavigationActivity) getActivity();
        } else {
            throw new RuntimeException("Navigable fragment must be used in navigation activity");
        }
    }
}
