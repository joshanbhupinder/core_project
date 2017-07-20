package com.spotspoon.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spotspoon.R;
import com.spotspoon.databinding.FragmentVideoBinding;


/**
 * Created by bhupinder on 19/7/17.
 */

public class VideoImageFragment extends Fragment
{
    private FragmentVideoBinding mFragmentVideoImageBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       mFragmentVideoImageBinding= DataBindingUtil.bind(inflater.inflate(R.layout.fragment_video,null));
        setData();
        return mFragmentVideoImageBinding.getRoot();
    }

    public void setData()
    {
        if (getArguments()!=null)
        {
            int position=getArguments().getInt("position");
            setImage(position);
        }
    }

    public void setImage(int position)
    {
        switch (position)
        {

            case 1:
                mFragmentVideoImageBinding.imageView.setImageDrawable(ContextCompat
                        .getDrawable(getActivity(), R.drawable.bg_image_sec));
                break;

            case 2:
                mFragmentVideoImageBinding.imageView.setImageDrawable(ContextCompat
                        .getDrawable(getActivity(), R.drawable.bg_image_third));
                break;

            case 3:
                mFragmentVideoImageBinding.imageView.setImageDrawable(ContextCompat
                        .getDrawable(getActivity(), R.drawable.bg_image_fourth));
                break;

            case 4:
                mFragmentVideoImageBinding.imageView.setImageDrawable(ContextCompat
                        .getDrawable(getActivity(), R.drawable.bg_imag_fifth));
                break;
        }
    }
}
