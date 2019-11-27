package com.example.annotation.annotation;

import android.content.Intent;
import android.view.View;

import com.example.annotation.R;
import com.example.annotation.base.BaseActivity;

public class AnnotationPoolActivity extends BaseActivity {

    @Override
    protected int getLayoutID() {
        return R.layout.activity_annotation_pool;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    public void onViewClick(View view) {
        int id = view.getId();
        if(id == R.id.btn_annotation_1){
            startActivity(new Intent(mContext,AnnotationTestActivity.class));
        }else if(id == R.id.btn_annotation_viewfinder){
            startActivity(new Intent(mContext,MyButterKnifeActivity.class));
        }
    }
}
