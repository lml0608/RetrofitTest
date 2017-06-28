package com.example.android.retrofittest.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jingbin on 2016/11/25.
 * 豆瓣热映item详情
 */

public class SubjectsBean{
    /**
     * rating : {"max":10,"average":6.9,"stars":"35","min":0}
     * genres : ["剧情","喜剧"]
     * title : 我不是潘金莲
     * casts : [{"alt":"https://movie.douban.com/celebrity/1050059/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1691.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1691.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1691.jpg"},"name":"范冰冰","id":"1050059"},{"alt":"https://movie.douban.com/celebrity/1274274/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/39703.jpg","large":"https://img3.doubanio.com/img/celebrity/large/39703.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/39703.jpg"},"name":"郭涛","id":"1274274"},{"alt":"https://movie.douban.com/celebrity/1324043/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/58870.jpg","large":"https://img3.doubanio.com/img/celebrity/large/58870.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/58870.jpg"},"name":"大鹏","id":"1324043"}]
     * （多少人评分）collect_count : 56325
     * （原名）original_title : 我不是潘金莲
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1274255/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/45667.jpg","large":"https://img1.doubanio.com/img/celebrity/large/45667.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/45667.jpg"},"name":"冯小刚","id":"1274255"}]
     * year : 2016
     * images : {"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2378133884.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2378133884.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2378133884.jpg"}
     * （更多信息）alt : https://movie.douban.com/subject/26630781/
     * id : 26630781
     */
    @SerializedName("rating")
    private RatingBean rating;
    @SerializedName("title")
    private String title;
    @SerializedName("collect_count")
    private int collect_count;
    @SerializedName("original_title")
    private String original_title;
    @SerializedName("subtype")
    private String subtype;
    @SerializedName("year")
    private String year;
    @SerializedName("images")
    private ImagesBean images;
    @SerializedName("alt")
    private String alt;
    @SerializedName("id")
    private String id;
    @SerializedName("genres")
    private List<String> genres;
    @SerializedName("casts")
    private List<PersonBean> casts;
    @SerializedName("directors")
    private List<PersonBean> directors;



    public RatingBean getRating() {
        return rating;
    }


    public String getTitle() {
        return this.title;
    }


    public int getCollect_count() {
        return collect_count;
    }


    public String getOriginal_title() {
        return original_title;
    }


    public String getSubtype() {
        return subtype;
    }


    public String getYear() {
        return year;
    }


    public ImagesBean getImages() {
        return images;
    }


    public String getAlt() {
        return alt;
    }


    public String getId() {
        return id;
    }


    public List<String> getGenres() {
        return genres;
    }


    public List<PersonBean> getCasts() {
        return casts;
    }


    public List<PersonBean> getDirectors() {
        return directors;
    }


    public void setRating(RatingBean rating) {
        this.rating = rating;
        //notifyPropertyChanged(BR.rating);
    }

    public void setTitle(String title) {
        this.title = title;
        //notifyPropertyChanged(BR.title);
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
        //notifyPropertyChanged(BR.collect_count);
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
        //notifyPropertyChanged(BR.original_title);
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
        //notifyPropertyChanged(BR.subtype);
    }

    public void setYear(String year) {
        this.year = year;
        //notifyPropertyChanged(BR.year);
    }

    public void setImages(ImagesBean images) {
        this.images = images;
        //notifyPropertyChanged(BR.images);
    }

    public void setAlt(String alt) {
        this.alt = alt;
        //notifyPropertyChanged(BR.alt);
    }

    public void setId(String id) {
        this.id = id;
        //notifyPropertyChanged(BR.id);
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
        //notifyPropertyChanged(BR.genres);
    }

    public void setCasts(List<PersonBean> casts) {
        this.casts = casts;
        //notifyPropertyChanged(BR.casts);
    }

    public void setDirectors(List<PersonBean> directors) {
        this.directors = directors;
        //notifyPropertyChanged(BR.directors);
    }

    public String toString() {
        return "SubjectsBean{" +
                "directors=" + directors +
                ", casts=" + casts +
                ", genres=" + genres +
                ", id='" + id + '\'' +
                ", alt='" + alt + '\'' +
                ", images=" + images +
                ", year='" + year + '\'' +
                ", subtype='" + subtype + '\'' +
                ", original_title='" + original_title + '\'' +
                ", collect_count=" + collect_count +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
