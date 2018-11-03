

package com.mindorks.framework.mvvm.ui.main;

import android.arch.lifecycle.ViewModelProvider;

import com.mindorks.framework.mvvm.ViewModelProviderFactory;
import com.mindorks.framework.mvvm.data.DataManager;
import com.mindorks.framework.mvvm.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by amitshekhar on 14/09/17.
 */
@Module
public class MainActivityModule {

    @Provides
    ViewModelProvider.Factory mainViewModelProvider(MainViewModel mainViewModel) {
        return new ViewModelProviderFactory<>(mainViewModel);
    }

    @Provides
    MainViewModel provideMainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new MainViewModel(dataManager, schedulerProvider);
    }
}
