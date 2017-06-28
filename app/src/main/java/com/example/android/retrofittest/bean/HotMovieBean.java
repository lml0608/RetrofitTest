package com.example.android.retrofittest.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jingbin on 2016/11/25.
 */

public class HotMovieBean {

    @SerializedName("count")
    private int count;
    @SerializedName("start")
    private int start;
    @SerializedName("total")
    private int total;
    @SerializedName("title")
    private String title;
    @SerializedName("subjects")
    private List<SubjectsBean> subjects;


    public int getCount() {
        return count;
    }

    public int getStart() {
        return start;
    }

    public int getTotal() {
        return total;
    }

    public String getTitle() {
        return title;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setStart(int start) {
        this.start = start;
        //notifyPropertyChanged(BR.start);
    }

    public void setTotal(int total) {
        this.total = total;
        //notifyPropertyChanged(BR.total);
    }

    public void setTitle(String title) {
        this.title = title;
        //notifyPropertyChanged(BR.title);
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
        //notifyPropertyChanged(BR.subjects);
    }
}
