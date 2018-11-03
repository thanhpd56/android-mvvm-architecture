

package com.mindorks.framework.mvvm.ui.feed.opensource;

import android.arch.lifecycle.ViewModelProvider;
import android.support.v7.widget.LinearLayoutManager;

import com.mindorks.framework.mvvm.ViewModelProviderFactory;
import com.mindorks.framework.mvvm.data.DataManager;
import com.mindorks.framework.mvvm.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by amitshekhar on 14/09/17.
 */
@Module
public class OpenSourceFragmentModule {

    @Provides
    OpenSourceViewModel openSourceViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        return new OpenSourceViewModel(dataManager, schedulerProvider);
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(OpenSourceFragment fragment) {
        return new LinearLayoutManager(fragment.getActivity());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter();
    }

    @Provides
    ViewModelProvider.Factory provideOpenSourceViewModel(OpenSourceViewModel openSourceViewModel) {
        return new ViewModelProviderFactory<>(openSourceViewModel);
    }
}
