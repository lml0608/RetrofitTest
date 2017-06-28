package com.example.android.retrofittest;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.retrofittest.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private ImageView ivImg;
    private View llMovieTop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initView();


    }

    private void initView() {

        ivImg = mBinding.ivImg;
        llMovieTop = mBinding.llMovieTop;

        Glide.with(this)
                .load("http://ojyz0c8un.bkt.clouddn.com/one_01.png")
                .placeholder(R.drawable.img_one_bi_one)
                .error(R.drawable.img_one_bi_one)
                .crossFade(1500)
                .into(ivImg);

        llMovieTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DoubanTopActivity.class));
            }
        });

    }




    private void getMovie() {


    }
}
