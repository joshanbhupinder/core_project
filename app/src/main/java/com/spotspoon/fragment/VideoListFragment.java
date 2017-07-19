package com.spotspoon.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spotspoon.R;
import com.spotspoon.adapter.VideoListAdapter;
import com.spotspoon.databinding.VideoListBinding;

/**
 * Created by bhupinder on 20/7/17.
 */

public class VideoListFragment extends Fragment
{
    private VideoListBinding mVideoListBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mVideoListBinding= DataBindingUtil.bind(inflater.inflate(R.layout.video_list,null));
        mVideoListBinding.recyleview.setLayoutManager(new LinearLayoutManager(getActivity()));
        mVideoListBinding.recyleview.setAdapter(new VideoListAdapter(getActivity()));
        return mVideoListBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
