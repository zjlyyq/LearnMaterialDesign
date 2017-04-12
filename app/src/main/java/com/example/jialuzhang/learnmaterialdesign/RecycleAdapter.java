package com.example.jialuzhang.learnmaterialdesign;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zjl on 2017/4/12.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context  mContext;
    private List<String>  list;
    public RecycleAdapter(Context context,List<String> list){
        this.mContext = context;
        this.list = list;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TextView textView = new TextView(t)
        View view = LayoutInflater.from(mContext).inflate(android.R.layout.simple_list_item_1,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        holder.te
    }

    @Override
    public int getItemCount() {
        return null == list?0:list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public MyViewHolder(View view){
            super(view);
            textView = (TextView)view;
        }
    }
}
