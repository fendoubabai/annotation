package com.example.annotation.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;

public abstract class BaseActivity extends Activity {

    protected Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(getLayoutID());
        mContext = this;
        initView();
        initData();
    }

    protected abstract int getLayoutID();

    protected abstract void initView();

    protected abstract void initData();






}
