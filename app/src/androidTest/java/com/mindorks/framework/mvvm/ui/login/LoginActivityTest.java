

package com.mindorks.framework.mvvm.ui.login;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.mindorks.framework.mvvm.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by amitshekhar on 11/07/17.
 */

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void checkViewsDisplay() {

        onView(withId(R.id.etEmail))
                .check(matches(isDisplayed()));

        onView(withId(R.id.etPassword))
                .check(matches(isDisplayed()));

        onView(withId(R.id.btnServerLogin))
                .check(matches(isDisplayed()));

        onView(withText(R.string.login))
                .check(matches(isDisplayed()));

        onView(withId(R.id.ibGoogleLogin))
                .check(matches(isDisplayed()));

        onView(withId(R.id.ibFbLogin))
                .check(matches(isDisplayed()));
    }
}
