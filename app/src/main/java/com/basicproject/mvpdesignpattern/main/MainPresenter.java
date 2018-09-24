package com.basicproject.mvpdesignpattern.main;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view) {
        mView = view;
    }


    /////   Presenter methods    /////

    @Override
    public void handleSignInButtonClick() {
        mView.showSignInScreen();
    }

    @Override
    public void handleSignupbuttonClick() {
        mView.showSignUpScreen();
    }
}
