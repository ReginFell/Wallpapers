package ua.regin.wallpapers.ui.image.details.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import ua.regin.wallpapers.entity.ImageResponse;
import ua.regin.wallpapers.ui.image.details.ImageDetailsFragment_;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private List<ImageResponse> imageResponseList;

    public PagerAdapter(FragmentManager fragmentManager, List<ImageResponse> imageResponseList) {
        super(fragmentManager);
        this.imageResponseList = imageResponseList;
    }

    @Override
    public Fragment getItem(int position) {
        return ImageDetailsFragment_.builder().imageResponse(imageResponseList.get(position)).build();
    }

    @Override
    public int getCount() {
        return imageResponseList.size();
    }
}