package ua.regin.wallpapers.entity;

public class ImageResponse {

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
