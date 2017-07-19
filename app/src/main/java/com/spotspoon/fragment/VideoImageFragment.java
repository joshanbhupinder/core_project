package com.spotspoon.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spotspoon.R;
import com.spotspoon.databinding.DashboardBinding;
import com.spotspoon.databinding.FragmentVideoImageBinding;

/**
 * Created by bhupinder on 19/7/17.
 */

public class VideoImageFragment extends Fragment
{
    private FragmentVideoImageBinding mFragmentVideoImageBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       mFragmentVideoImageBinding= DataBindingUtil.bind(inflater.inflate(R.layout.fragment_video_image,null));
        return mFragmentVideoImageBinding.getRoot();
    }
}
