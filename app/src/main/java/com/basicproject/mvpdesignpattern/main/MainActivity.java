package com.basicproject.mvpdesignpattern.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.basicproject.mvpdesignpattern.R;
import com.basicproject.mvpdesignpattern.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding mainActivityBinding = DataBindingUtil.setContentView(MainActivity.this, R.layout.main_activity);
        mPresenter = new MainPresenter(this);
        mainActivityBinding.setPresenter(mPresenter);
    }

    /////        View methods          /////

    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "You'll be directed to SignIn Screen ", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "You'll be directed to SignUp Screen ", Toast.LENGTH_SHORT).show();
    }
}
