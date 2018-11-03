

package com.frovis.vuitro.ui.main.rating;

import com.frovis.vuitro.data.DataManager;
import com.frovis.vuitro.ui.base.BaseViewModel;
import com.frovis.vuitro.utils.rx.SchedulerProvider;

/**
 * Created by amitshekhar on 10/07/17.
 */

public class RateUsViewModel extends BaseViewModel<RateUsCallback> {

    public RateUsViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    public void onLaterClick() {
        getNavigator().dismissDialog();
    }

    public void onSubmitClick() {
        getNavigator().dismissDialog();
    }
}
