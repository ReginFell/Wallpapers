package ua.regin.wallpapers.ui.image;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import ua.regin.wallpapers.R;
import ua.regin.wallpapers.ui.BaseActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @ViewById
    protected NavigationView navigationView;

    @ViewById
    protected DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ImagePageFragment_.builder().build())
                    .commit();
        }
    }

    public void setToolbar(Toolbar toolbar, int titleId) {
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        toolbar.setNavigationOnClickListener(ignored -> drawerLayout.openDrawer(GravityCompat.START));

        if (actionBar != null) {
            actionBar.setTitle(titleId);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24px);
        }
    }
}


