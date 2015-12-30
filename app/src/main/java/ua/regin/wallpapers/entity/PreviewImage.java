package ua.regin.wallpapers.entity;

import java.io.Serializable;

public class PreviewImage implements Serializable {

    private String url;
    private int height;
    private int width;

    public String getUrl() {
        return url;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
