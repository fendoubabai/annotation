package com.example.annotation.annotation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.annotation.R;
import com.example.annotation.base.BaseActivity;
import com.example.viewfinder.ViewFinder;
import com.example.viewfinder_annotation.BindView;
import com.example.viewfinder_annotation.OnClick;

public class MyButterKnifeActivity extends AppCompatActivity {

    @BindView(R.id.iv1)
    ImageView mIv1;
    @BindView(R.id.iv2)
    ImageView mIv2;
    @BindView(R.id.iv3)
    ImageView mIv3;
    private MyButterKnifeActivity mContext;

//    @OnClick(R.id.iv1)
//    public void onViewClick(View view){
//        int id = view.getId();
//        if(id == R.id.iv1){
//            Toast.makeText(mContext,"第一个视图",Toast.LENGTH_SHORT).show();
//        }else if(id == R.id.iv2){
//            Toast.makeText(mContext,"第二个视图",Toast.LENGTH_SHORT).show();
//        }else if(id == R.id.iv3){
//            Toast.makeText(mContext,"第三个视图",Toast.LENGTH_SHORT).show();
//        }
//    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotation_viewbinder);
        ViewFinder.inject(MyButterKnifeActivity.this);
        mContext = this;

        mIv1.setBackgroundResource(R.drawable.ic_launcher_background);
    }

    @OnClick({R.id.iv1})
    public void onClick(){

        Toast.makeText(mContext,"butterKnife onClick is work",Toast.LENGTH_SHORT).show();

    }

}
