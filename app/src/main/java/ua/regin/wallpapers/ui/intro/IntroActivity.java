package ua.regin.wallpapers.ui.intro;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.paolorotolo.appintro.AppIntro;

import ua.regin.wallpapers.R;

public class IntroActivity extends AppIntro { // TODO: 28.12.15

    @Override
    public void init(@Nullable Bundle savedInstanceState) {
        Resources resources = getResources();

        int backgroundColor = resources.getColor(R.color.colorAccent);
        int barColor = resources.getColor(R.color.colorPrimary);

        int thirdColor = Color.parseColor("#8bc34a");

        addSlide(AppIntroFragment.newInstance("TEST", "Test screen 1", R.drawable.intro_1, backgroundColor));
        addSlide(AppIntroFragment.newInstance("TEST", "Test screen 2", R.drawable.intro_2, barColor));
        addSlide(AppIntroFragment.newInstance("TEST", "Test screen 3", R.drawable.intro_3, thirdColor));
    }

    @Override
    public void onSkipPressed() {

    }

    @Override
    public void onNextPressed() {

    }

    @Override
    public void onDonePressed() {

    }

    @Override
    public void onSlideChanged() {

    }

}
