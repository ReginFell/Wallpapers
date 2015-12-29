package ua.regin.wallpapers.api;

import retrofit.http.GET;
import rx.Observable;
import ua.regin.wallpapers.entity.Response;

public interface IApi {

    @GET("wallpapers")
    Observable<Response> getImageList();
}
