package com.example.annotation.annotationtest;

import android.Manifest;
import android.graphics.Bitmap;
import android.support.annotation.FloatRange;
import android.support.annotation.IntDef;
import android.support.annotation.RequiresPermission;
import android.support.annotation.Size;
import android.support.annotation.StringRes;
import android.util.Log;
import android.widget.Toast;

import com.example.annotation.R;
import com.example.annotation.base.BaseActivity;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.ParseException;

public class AntationhahaActivity extends BaseActivity {

    public static final int COLOR_RED = 0;
    public static final int COLOR_GREEN = 1;
    public static final int COLOR_YELLOW = 2;
    float currentProgress;


    @Override
    protected int getLayoutID() {
        return R.layout.activity_annotation_pool;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() throws ParseException {
        //调用
        setColor(COLOR_RED);
        setColor(0);
        setColorEnum(ColorEmun.GREEN);

        setColorDef(Colors.RED);
//        setColorDef(0);

        setCurrentProgress(0.1f);
//        setCurrentProgress(1.1f);

        getStringById1(R.mipmap.ic_launcher);
        getStringById(R.string.app_name);
    }



    /**
     * 资源注解
     */
    public String getStringById(@StringRes int stringResId) {
        return getResources().getString(stringResId);
    }

    public String getStringById1(int stringResId) {
        return getResources().getString(stringResId);
    }

    @RequiresPermission(Manifest.permission.INTERNET)
    public void changeWallpaper(Bitmap bitmap) throws IOException {
    }

    //限制字符串的长度
    private void setKey(@Size(6) String key) {
    }

    //限定数组集合的大小
    private void setData(@Size(max = 1) String[] data) {
    }

    public void setCurrentProgress(@FloatRange(from=0.0f, to=1.0f) float progress) {
        currentProgress = progress;
    }

    private void setColorDef(@Colors.LightColors int RED) {
//        Log.e("tag","==========  " + color);
    }

    /**
     * setColor(COLOR_RED)与setColor(0)效果一样,而后者可读性很差,但却可以正常运行
     * setColor方法可以接受枚举之外的值,比如setColor(3),这种情况下程序可能出问题
     */
    public void setColor(int color) {
        //some code here
        Log.e("tag","==========  " + color);

    }

    /**
     * 然而Enum也并非最佳,Enum因为其相比方案一的常量来说,
     * 占用内存相对大很多而受到曾经被Google列为不建议使用
     */
    public void setColorEnum(ColorEmun colorEnum) {
        //some code here
        Log.e("tag","==========  " + colorEnum);
    }



}
