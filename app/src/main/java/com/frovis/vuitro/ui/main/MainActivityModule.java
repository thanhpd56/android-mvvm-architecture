

package com.frovis.vuitro.ui.main;

import android.arch.lifecycle.ViewModelProvider;

import com.frovis.vuitro.ViewModelProviderFactory;
import com.frovis.vuitro.data.DataManager;
import com.frovis.vuitro.utils.rx.SchedulerProvider;

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
