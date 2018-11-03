package com.frovis.vuitro.ui.feed;

import com.frovis.vuitro.data.DataManager;
import com.frovis.vuitro.ui.base.BaseViewModel;
import com.frovis.vuitro.utils.rx.SchedulerProvider;

/**
 * Created by Jyoti on 29/07/17.
 */

public class FeedViewModel extends BaseViewModel {

    public FeedViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }
}
