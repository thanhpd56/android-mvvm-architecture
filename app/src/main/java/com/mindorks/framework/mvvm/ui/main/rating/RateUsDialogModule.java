

package com.mindorks.framework.mvvm.ui.main.rating;

import com.mindorks.framework.mvvm.data.DataManager;
import com.mindorks.framework.mvvm.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by amitshekhar on 14/09/17.
 */
@Module
public class RateUsDialogModule {

    @Provides
    RateUsViewModel provideRateUsViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new RateUsViewModel(dataManager, schedulerProvider);
    }
}
