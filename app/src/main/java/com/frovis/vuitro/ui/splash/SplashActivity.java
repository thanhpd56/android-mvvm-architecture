

package com.frovis.vuitro.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.frovis.vuitro.BR;
import com.frovis.vuitro.R;
import com.frovis.vuitro.databinding.ActivitySplashBinding;
import com.frovis.vuitro.ui.base.BaseActivity;
import com.frovis.vuitro.ui.login.LoginActivity;
import com.frovis.vuitro.ui.main.MainActivity;

import javax.inject.Inject;

/**
 * Created by amitshekhar on 08/07/17.
 */

public class SplashActivity extends BaseActivity<ActivitySplashBinding, SplashViewModel> implements SplashNavigator {

    @Inject
    SplashViewModel mSplashViewModel;

    public static Intent newIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public SplashViewModel getViewModel() {
        return mSplashViewModel;
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.newIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.newIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSplashViewModel.setNavigator(this);
        mSplashViewModel.startSeeding();
    }
}
