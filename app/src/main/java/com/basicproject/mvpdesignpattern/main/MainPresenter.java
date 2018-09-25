package com.basicproject.mvpdesignpattern.main;

import android.view.View;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view) {
        mView = view;
    }


    /////      Presenter methods       /////

    @Override
    public void handleSignInButtonClick(View view) {
        mView.showSignInScreen();
    }

    @Override
    public void handleSignupbuttonClick(View view) {
        mView.showSignUpScreen();
    }
}
