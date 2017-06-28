package com.example.android.retrofittest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import com.example.android.retrofittest.adapter.DouBanTopAdapter;
import com.example.android.retrofittest.bean.HotMovieBean;
import com.example.android.retrofittest.bean.SubjectsBean;
import com.example.android.retrofittest.databinding.ActivityDoubanTopBinding;
import com.example.android.retrofittest.network.ApiClient;
import com.example.android.retrofittest.network.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DoubanTopActivity extends AppCompatActivity {

    private static final String TAG = "DoubanTopActivity";
    private ActivityDoubanTopBinding mBinding;

    private DouBanTopAdapter adaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_douban_top);

        mBinding.xrvTop.setLayoutManager(new GridLayoutManager(this, 3));
        mBinding.xrvTop.setHasFixedSize(true);
        adaper = new DouBanTopAdapter(this);
        mBinding.xrvTop.setAdapter(adaper);



        loadDouBanTop250();

       // mBinding.xrvTop;
    }

    private void loadDouBanTop250() {

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<HotMovieBean> call = apiService.getMovieTop250(0,21);

        call.enqueue(new Callback<HotMovieBean>() {
            @Override
            public void onResponse(Call<HotMovieBean> call, Response<HotMovieBean> response) {
                List<SubjectsBean> movies = response.body().getSubjects();


                adaper.swapData(movies);

                Log.i(TAG, String.valueOf(movies.get(1)));
            }

            @Override
            public void onFailure(Call<HotMovieBean> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
}
