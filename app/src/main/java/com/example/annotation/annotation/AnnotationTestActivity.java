package com.example.annotation.annotation;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.annotation.R;


/**
 * Created by thinkpad on 2018/3/30.
 */

public class AnnotationTestActivity extends Activity {

    private TextView mTv1,mTv2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotation);
        initView();
        initData();
    }

    private void initView() {
        mTv1 = (TextView) findViewById(R.id.textView1);
        mTv2 = (TextView) findViewById(R.id.textView2);
    }

    private void initData() {
        Class<People> clazz = People.class;
        Document documents = clazz.getAnnotation(Document.class);
        System.out.println(documents.value());
        mTv1.setText(documents.value());
    }
}
