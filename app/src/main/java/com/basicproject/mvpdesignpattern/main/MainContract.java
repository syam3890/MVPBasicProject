package com.basicproject.mvpdesignpattern.main;

public interface MainContract {

    interface MvpView {

        void showSignInScreen();

        void showSignUpScreen();

    }

    interface Presenter {
        void handleSignInButtonClick();

        void handleSignupbuttonClick();
    }
}
