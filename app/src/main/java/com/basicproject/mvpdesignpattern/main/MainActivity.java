package com.basicproject.mvpdesignpattern.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.basicproject.mvpdesignpattern.R;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mPresenter = new MainPresenter(this);
    }
}
