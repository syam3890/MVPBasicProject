package com.basicproject.mvpdesignpattern.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.basicproject.mvpdesignpattern.R;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mPresenter = new MainPresenter(this);
    }

    /////   View methods     /////

    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "You'll be directed to SignIn Screen ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "You'll be directed to SignUp Screen ", Toast.LENGTH_SHORT).show();
    }
}
