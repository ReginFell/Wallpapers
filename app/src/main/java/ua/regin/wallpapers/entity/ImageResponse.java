package ua.regin.wallpapers.entity;

import java.io.Serializable;

public class ImageResponse implements Serializable{

    private long id;
    private int height;
    private int width;
    private Image image;
    private String uploader;

    public long getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Image getImage() {
        return image;
    }

    public String getUploader() {
        return uploader;
    }

}
