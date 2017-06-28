package com.example.android.retrofittest.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by jingbin on 2016/11/25.
 */

public class RatingBean {
    /**
     * max : 10
     * average : 6.9
     * stars : 35
     * min : 0
     */
    @SerializedName("max")
    private int max;
    @SerializedName("average")
    private double average;
    @SerializedName("stars")
    private String stars;
    @SerializedName("min")
    private int min;


    public int getMax() {
        return max;
    }


    public double getAverage() {
        return average;
    }


    public String getStars() {
        return stars;
    }


    public int getMin() {
        return min;
    }

    public void setMax(int max) {
        this.max = max;
        //notifyPropertyChanged(BR.max);
    }

    public void setAverage(double average) {
        this.average = average;
       //notifyPropertyChanged(BR.average);
    }

    public void setStars(String stars) {
        this.stars = stars;
        //notifyPropertyChanged(BR.stars);
    }

    public void setMin(int min) {
        this.min = min;
        //notifyPropertyChanged(BR.min);
    }
}
