package ua.regin.wallpapers.ui;

import android.util.Log;
import android.widget.Toast;

import com.trello.rxlifecycle.components.support.RxFragment;

public abstract class BaseFragment extends RxFragment {

    public void handleError(Throwable throwable) {
        Log.d("Error", throwable.getMessage());
        Toast.makeText(getContext(), throwable.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
