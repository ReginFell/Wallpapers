package ua.regin.wallpapers.injector.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ua.regin.wallpapers.api.IApi;
import ua.regin.wallpapers.manager.IImageManager;
import ua.regin.wallpapers.manager.impl.ImageManager;

@Module
public class ImageModule {

    @Provides
    @Singleton
    public IImageManager providePodcastManager(IApi api) {
        return new ImageManager(api);
    }
}