package ua.regin.wallpapers.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.EActivity;

import ua.regin.wallpapers.R;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  Intent intent = new Intent(this, IntroActivity.class);
        //  intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        // intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        //   startActivity(intent);
    }
}


