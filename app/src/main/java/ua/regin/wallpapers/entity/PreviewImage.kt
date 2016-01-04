package ua.regin.wallpapers.entity;

import java.io.Serializable;

class PreviewImage : Serializable {

    var url: String;
    var height: Int;
    var width: Int;

    constructor(url: String, height: Int, width: Int) {
        this.url = url
        this.height = height
        this.width = width
    }
}
