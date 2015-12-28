package ua.regin.wallpapers.application;

import ua.regin.wallpapers.injectors.components.AppComponent;
import ua.regin.wallpapers.injectors.components.DaggerAppComponent;
import ua.regin.wallpapers.injectors.modules.ApiModule;
import ua.regin.wallpapers.injectors.modules.AppModule;

public class Application extends android.app.Application {

    private static final String BASE_URL = "https://api.desktoppr.co/1/";

    private static Application application;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static Application getApplication() {
        return application;
    }

    public AppComponent getAppComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .apiModule(new ApiModule(BASE_URL))
                    .build();
        }
        return appComponent;
    }

}
