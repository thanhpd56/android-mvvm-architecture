

package com.frovis.vuitro.ui.about;

import com.frovis.vuitro.data.DataManager;
import com.frovis.vuitro.ui.base.BaseViewModel;
import com.frovis.vuitro.utils.rx.SchedulerProvider;

/**
 * Created by amitshekhar on 09/07/17.
 */

public class AboutViewModel extends BaseViewModel<AboutNavigator> {

    public AboutViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    public void onNavBackClick() {
        getNavigator().goBack();
    }
}
