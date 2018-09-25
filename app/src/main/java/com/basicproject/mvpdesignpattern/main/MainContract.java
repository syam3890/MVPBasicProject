package com.basicproject.mvpdesignpattern.main;

import android.view.View;

public interface MainContract {

    interface MvpView {

        void showSignInScreen();

        void showSignUpScreen();

    }

    interface Presenter {
        void handleSignInButtonClick(View view);

        void handleSignupbuttonClick(View view);
    }
}
