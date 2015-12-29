package ua.regin.wallpapers.entity;

public class Image {

    private String url;
    private PreviewImage thumb;
    private PreviewImage preview;

    public String getUrl() {
        return url;
    }

    public PreviewImage getThumb() {
        return thumb;
    }

    public PreviewImage getPreview() {
        return preview;
    }
}
