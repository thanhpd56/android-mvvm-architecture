

package com.frovis.vuitro.di.builder;

import com.frovis.vuitro.ui.about.AboutFragmentProvider;
import com.frovis.vuitro.ui.feed.FeedActivity;
import com.frovis.vuitro.ui.feed.FeedActivityModule;
import com.frovis.vuitro.ui.feed.blogs.BlogFragmentProvider;
import com.frovis.vuitro.ui.feed.opensource.OpenSourceFragmentProvider;
import com.frovis.vuitro.ui.login.LoginActivity;
import com.frovis.vuitro.ui.login.LoginActivityModule;
import com.frovis.vuitro.ui.main.MainActivity;
import com.frovis.vuitro.ui.main.MainActivityModule;
import com.frovis.vuitro.ui.main.rating.RateUsDialogProvider;
import com.frovis.vuitro.ui.splash.SplashActivity;
import com.frovis.vuitro.ui.splash.SplashActivityModule;

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
