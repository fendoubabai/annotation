package com.example.annotation.annotationtest;

import java.util.Date;

public class Student {

    @Label("姓名")
    private String name;
    @Label("出生日期")
    @Formats(pattern="yyyy/MM/dd")
    private Date born;
    @Label("分数")
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
