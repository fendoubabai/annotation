package com.example.annotation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.annotation.annotation.AnnotationPoolActivity;
import com.example.annotation.base.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    public void onViewClick(View view) {
        int id  = view.getId();
        if(id == R.id.btn_antotation){
            startActivity(new Intent(mContext, AnnotationPoolActivity.class));
        }
    }
}
