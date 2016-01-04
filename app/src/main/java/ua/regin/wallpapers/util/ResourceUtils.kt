package ua.regin.wallpapers.util;

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build

public class ResourceUtils {

    @Suppress("DEPRECATION")
    public fun getDrawable(context: Context, drawableId: Int): Drawable {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            return context.getDrawable(drawableId);
        return context.resources.getDrawable(drawableId);
    }

    companion object Helper {
        fun create(): ResourceUtils = ResourceUtils()
    }
}