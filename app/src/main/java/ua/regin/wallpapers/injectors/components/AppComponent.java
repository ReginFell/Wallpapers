package ua.regin.wallpapers.injectors.components;

import javax.inject.Singleton;

import dagger.Component;
import ua.regin.wallpapers.injectors.modules.ApiModule;
import ua.regin.wallpapers.injectors.modules.AppModule;

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
}
