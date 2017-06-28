package com.example.android.retrofittest.adapter;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.retrofittest.R;
import com.example.android.retrofittest.bean.SubjectsBean;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zengzhi on 2017/6/28.
 */

public class DouBanTopAdapter extends RecyclerView.Adapter<DouBanTopAdapter.DouBanTopHolder> {

    private static final String TAG = "DouBanTopAdapter";
    private List<SubjectsBean> data = new ArrayList<>();
    private Context mContext;

    public DouBanTopAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public DouBanTopAdapter.DouBanTopHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_douban_top, parent, false);

        return new DouBanTopHolder(view);
    }

    @Override
    public void onBindViewHolder(DouBanTopAdapter.DouBanTopHolder holder, int position) {

        SubjectsBean bean = data.get(position);

        Log.i(TAG, "你好");

        Log.i(TAG, bean.getId());
        Log.i(TAG, bean.getTitle());
        Glide.with(mContext)
                .load(bean.getImages().getLarge())
                .placeholder(R.drawable.img_one_bi_one)
                .error(R.drawable.img_one_bi_one)
                .crossFade(1500)
                .into(holder.imageView);

        holder.text1.setText(bean.getTitle());
        holder.text2.setText(bean.getId());
    }

    @Override
    public int getItemCount() {

        Log.i(TAG, "size = " + data.size());
        return data.size();
    }

    public class DouBanTopHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView text1;
        private TextView text2;

        public DouBanTopHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_top_photo);
            text1 = (TextView) itemView.findViewById(R.id.tv_name);
            text2 = (TextView) itemView.findViewById(R.id.tv_rate);
        }
    }


    public void swapData(List<SubjectsBean> datalist) {

        data = datalist;
        notifyDataSetChanged();
    }
}
