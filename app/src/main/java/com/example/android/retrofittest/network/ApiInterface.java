package com.example.android.retrofittest.network;

import android.database.Observable;

import com.example.android.retrofittest.bean.HotMovieBean;
import com.example.android.retrofittest.bean.MovieDetailBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by zengzhi on 2017/6/28.
 */

public interface ApiInterface {

    @GET("v2/movie/top250")
    Call<HotMovieBean> getMovieTop250(@Query("start") int start, @Query("count") int count);


    /**
     * 豆瓣热映电影，每日更新
     */
    @GET("v2/movie/in_theaters")
    Observable<HotMovieBean> getHotMovie();

    /**
     * 获取电影详情
     *
     * @param id 电影bean里的id
     */
    @GET("v2/movie/subject/{id}")
    Observable<MovieDetailBean> getMovieDetail(@Path("id") String id);
}
