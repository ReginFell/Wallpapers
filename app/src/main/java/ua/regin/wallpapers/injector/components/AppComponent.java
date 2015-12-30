package ua.regin.wallpapers.injector.components;

import javax.inject.Singleton;

import dagger.Component;
import ua.regin.wallpapers.injector.modules.ApiModule;
import ua.regin.wallpapers.injector.modules.AppModule;
import ua.regin.wallpapers.injector.modules.ImageModule;
import ua.regin.wallpapers.ui.image.ImagePageFragment;
import ua.regin.wallpapers.ui.image.details.ImageDetailsPagerFragment;

@Singleton
@Component(modules = {AppModule.class, ApiModule.class, ImageModule.class})
public interface AppComponent {

    void inject(ImagePageFragment imagePageFragment);

    void inject(ImageDetailsPagerFragment imageDetailsPagerFragment);
}
