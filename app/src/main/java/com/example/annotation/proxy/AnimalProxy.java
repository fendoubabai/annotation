package com.example.annotation.proxy;

import android.util.Log;

/**
 * Created by juexingzhe on 2017/5/23.
 */

public class AnimalProxy implements Fly, Run{

    private Animal animal;

    public AnimalProxy(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void fly() {
        Log.i(Utils.TAG, "In AnimalProxy fly");
        animal.fly();
    }

    @Override
    public void run() {
        Log.i(Utils.TAG, "In AnimalProxy run");
        animal.run();

    }
}
