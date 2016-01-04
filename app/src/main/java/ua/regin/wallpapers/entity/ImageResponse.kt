package ua.regin.wallpapers.entity;

import java.io.Serializable;

class ImageResponse : Serializable {

    var id: Long;
    var height: Int;
    var width: Int;
    var image: Image;
    var uploader: String;

    constructor(id: Long, height: Int, width: Int, image: Image, uploader: String) {
        this.id = id
        this.height = height
        this.width = width
        this.image = image
        this.uploader = uploader
    }
}
