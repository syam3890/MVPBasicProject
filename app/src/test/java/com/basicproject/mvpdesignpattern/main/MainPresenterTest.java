package com.basicproject.mvpdesignpattern.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

/*
 * local unit test for Main Presenter.
 */
public class MainPresenterTest {

    @Mock

    private MainContract.MvpView mView;

    private MainPresenter mPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mPresenter = new MainPresenter(mView);
    }

    @Test
    public void handleSignInButtonClick() {
//        mPresenter.handleSignInButtonClick();
        verify(mView).showSignInScreen();
    }

    @Test
    public void handleSignupbuttonClick() {
//        mPresenter.handleSignupbuttonClick();
        verify(mView).showSignUpScreen();
    }
}