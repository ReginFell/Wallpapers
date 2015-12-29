package ua.regin.wallpapers.manager.impl;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import ua.regin.wallpapers.api.IApi;
import ua.regin.wallpapers.entity.ImageResponse;
import ua.regin.wallpapers.entity.Response;
import ua.regin.wallpapers.manager.IImageManager;

public class ImageManager implements IImageManager {

    private IApi api;

    @Inject
    public ImageManager(IApi api) {
        this.api = api;
    }

    @Override
    public Observable<List<ImageResponse>> getImageList() {
        return api.getImageList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(this::unwrapResponse);
    }

    private List<ImageResponse> unwrapResponse(Response response) {
        return response.getResponse();
    }
}
