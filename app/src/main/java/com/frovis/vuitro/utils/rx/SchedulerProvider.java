

package com.frovis.vuitro.utils.rx;

import io.reactivex.Scheduler;

/**
 * Created by amitshekhar on 07/07/17.
 */

public interface SchedulerProvider {

    Scheduler computation();

    Scheduler io();

    Scheduler ui();
}
