

package com.frovis.vuitro.di.component;

import android.app.Application;

import com.frovis.vuitro.MvvmApp;
import com.frovis.vuitro.di.builder.ActivityBuilder;
import com.frovis.vuitro.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by amitshekhar on 07/07/17.
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    void inject(MvvmApp app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
