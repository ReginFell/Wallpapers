package ua.regin.wallpapers.entity;

import java.io.Serializable;

class Image : Serializable {

    var url: String;
    var thumb: PreviewImage;
    var preview: PreviewImage;

    constructor(url: String, thumb: PreviewImage, preview: PreviewImage) {
        this.url = url
        this.thumb = thumb
        this.preview = preview
    }
}
