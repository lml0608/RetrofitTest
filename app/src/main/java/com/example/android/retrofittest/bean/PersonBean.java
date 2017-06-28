package com.example.android.retrofittest.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by jingbin on 2016/11/25.
 */

public class PersonBean {
    /**
     * alt : https://movie.douban.com/celebrity/1050059/
     * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/1691.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1691.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1691.jpg"}
     * name : 范冰冰  or
     * name : 冯小刚
     * id : 1050059
     * type: 导演 或 演员
     */
    @SerializedName("alt")
    private String alt;

    // 导演或演员
    @SerializedName("type")
    private String type;

    @SerializedName("avatars")
    private ImagesBean avatars;
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private String id;

    public String getAlt() {
        return alt;
    }


    public ImagesBean getAvatars() {
        return avatars;
    }


    public String getName() {
        return name;
    }


    public String getId() {
        return id;
    }

    public void setAlt(String alt) {
        this.alt = alt;
        //notifyPropertyChanged(BR.alt);
    }

    public void setAvatars(ImagesBean avatars) {
        this.avatars = avatars;
        //notifyPropertyChanged(BR.avatars);
    }

    public void setName(String name) {
        this.name = name;
        //notifyPropertyChanged(BR.name);
    }

    public void setId(String id) {
        this.id = id;
        //notifyPropertyChanged(BR.id);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        //notifyPropertyChanged(BR.type);
    }
}
