package com.spotspoon.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spotspoon.R;
import com.spotspoon.databinding.ListItemBinding;

/**
 * Created by bhupinder on 20/7/17.
 */

public class VideoListAdapter extends RecyclerView.Adapter<VideoListAdapter.ViewHolder> {

    Context mContext;
    public VideoListAdapter(Context context)
    {

        mContext=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ListItemBinding listItemBinding= DataBindingUtil.bind(LayoutInflater
                .from(mContext).inflate(R.layout.list_item,parent,false));
        return new ViewHolder(listItemBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.listItemBinding.textView.setText("FIRST");

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ListItemBinding listItemBinding;

        public ViewHolder(ListItemBinding listItemBinding) {
            super(listItemBinding.getRoot());
           this.listItemBinding=listItemBinding;
        }
    }
}
