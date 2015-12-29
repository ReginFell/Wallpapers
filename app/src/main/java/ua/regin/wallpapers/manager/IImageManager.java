package ua.regin.wallpapers.manager;

import java.util.List;

import rx.Observable;
import ua.regin.wallpapers.entity.ImageResponse;

public interface IImageManager {

    Observable<List<ImageResponse>> getImageList();

}
