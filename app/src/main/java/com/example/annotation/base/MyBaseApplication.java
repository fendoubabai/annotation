package com.example.annotation.base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * Created by lipan on 2014/12/6.
 */
public class MyBaseApplication extends Application{
	private static Context mContext;
	private static Handler mHandler;
	private static Thread mMainThread;
	@Override
	public void onCreate() {
		super.onCreate();
		mContext = this;
		mHandler = new Handler();
		mMainThread = Thread.currentThread();
	}

	public static Context getContext (){
		return mContext;
	}

	public static Handler getHandler(){
		return mHandler;
	}

	public static Thread getMainThread() {
		return mMainThread;
	}
}
