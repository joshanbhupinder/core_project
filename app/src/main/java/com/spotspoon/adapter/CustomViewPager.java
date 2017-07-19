package com.spotspoon.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.spotspoon.fragment.VideoImageFragment;

/**
 * Created by bhupinder on 20/7/17.
 */

public class CustomViewPager extends FragmentStatePagerAdapter {

    public CustomViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new VideoImageFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
