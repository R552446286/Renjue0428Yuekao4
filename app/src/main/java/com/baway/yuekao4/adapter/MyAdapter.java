package com.baway.yuekao4.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.baway.yuekao4.R;
import com.baway.yuekao4.bean.DataBean;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * @author 任珏
 * @类的用途
 * @date 2017/4/28 18:53
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private Context context;
    private List<DataBean.Data> data;

    public MyAdapter(Context context, List<DataBean.Data> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context, R.layout.recycler_item,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Glide.with(context).load(data.get(position).img).into(holder.item_iv);
        String[] split = data.get(position).title.split(":");
        holder.item_name.setText(split[0]);
        holder.item_age.setText(data.get(position).userAge+"岁");
        holder.item_job.setText(data.get(position).occupation);
        holder.item_introduction.setText(data.get(position).introduction);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private final ImageView item_iv;
        private final TextView item_name;
        private final TextView item_age;
        private final TextView item_job;
        private final TextView item_introduction;

        public MyViewHolder(View itemView) {
            super(itemView);
            item_iv = (ImageView) itemView.findViewById(R.id.item_iv);
            item_name = (TextView) itemView.findViewById(R.id.item_name);
            item_age = (TextView) itemView.findViewById(R.id.item_age);
            item_job = (TextView) itemView.findViewById(R.id.item_job);
            item_introduction = (TextView) itemView.findViewById(R.id.item_introduction);
        }
    }
}
