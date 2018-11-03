

package com.mindorks.framework.mvvm.di.builder;

import com.mindorks.framework.mvvm.ui.about.AboutFragmentProvider;
import com.mindorks.framework.mvvm.ui.feed.FeedActivity;
import com.mindorks.framework.mvvm.ui.feed.FeedActivityModule;
import com.mindorks.framework.mvvm.ui.feed.blogs.BlogFragmentProvider;
import com.mindorks.framework.mvvm.ui.feed.opensource.OpenSourceFragmentProvider;
import com.mindorks.framework.mvvm.ui.login.LoginActivity;
import com.mindorks.framework.mvvm.ui.login.LoginActivityModule;
import com.mindorks.framework.mvvm.ui.main.MainActivity;
import com.mindorks.framework.mvvm.ui.main.MainActivityModule;
import com.mindorks.framework.mvvm.ui.main.rating.RateUsDialogProvider;
import com.mindorks.framework.mvvm.ui.splash.SplashActivity;
import com.mindorks.framework.mvvm.ui.splash.SplashActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by amitshekhar on 14/09/17.
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {
            FeedActivityModule.class,
            BlogFragmentProvider.class,
            OpenSourceFragmentProvider.class})
    abstract FeedActivity bindFeedActivity();

    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity bindLoginActivity();

    @ContributesAndroidInjector(modules = {
            MainActivityModule.class,
            AboutFragmentProvider.class,
            RateUsDialogProvider.class})
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity bindSplashActivity();
}
