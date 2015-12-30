package ua.regin.wallpapers.entity;

import java.io.Serializable;

public class Image implements Serializable{

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
