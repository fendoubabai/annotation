package com.example.annotation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.annotation.annotation.AnnotationPoolActivity;
import com.example.annotation.annotationtest.SimpleFormatter;
import com.example.annotation.annotationtest.Student;
import com.example.annotation.base.BaseActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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



        test();



    }

    private void test() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Student zhangsan = new Student();
            zhangsan.setName("张三");
            zhangsan.setBorn(format.parse("1990-12-12"));
            zhangsan.setScore(655);
            Log.e("tag","=======注解生成：" + SimpleFormatter.format(zhangsan));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void onViewClick(View view) {
        int id  = view.getId();
        if(id == R.id.btn_antotation){
            startActivity(new Intent(mContext, AnnotationPoolActivity.class));
        }
    }
}
