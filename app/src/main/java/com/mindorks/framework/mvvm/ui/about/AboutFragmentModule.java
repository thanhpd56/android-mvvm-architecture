

package com.mindorks.framework.mvvm.ui.about;

import com.mindorks.framework.mvvm.data.DataManager;
import com.mindorks.framework.mvvm.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by amitshekhar on 14/09/17.
 */
@Module
public class AboutFragmentModule {

    @Provides
    AboutViewModel provideAboutViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new AboutViewModel(dataManager, schedulerProvider);
    }
}
