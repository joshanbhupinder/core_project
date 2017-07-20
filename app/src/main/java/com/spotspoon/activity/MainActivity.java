package com.spotspoon.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.spotspoon.R;
import com.spotspoon.adapter.CustomViewPagerWithTabs;
import com.spotspoon.databinding.ActivityMainBinding;
import com.spotspoon.fragment.CustomViewPager;
import com.spotspoon.fragment.ListResponse;
import com.spotspoon.fragment.Utils;
import com.spotspoon.fragment.VideoList;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ActivityMainBinding mActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(mActivityBinding.appbarLayout.toolbar);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this,
                mActivityBinding.drawerLayout, mActivityBinding.appbarLayout.toolbar, R.string.navigation_drawer_open
                , R.string.navigation_drawer_close);
        mActivityBinding.drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        mActivityBinding.navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setTitle("HOME");
        mActivityBinding.appbarLayout.toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setViewPager();
        setTabs();
    }



    public void setViewPager()
    {
        CustomViewPager customViewPager=new CustomViewPager(getSupportFragmentManager());
        mActivityBinding.appbarLayout.viewPager.setAdapter(customViewPager);
        mActivityBinding.appbarLayout.indicator.setViewPager(mActivityBinding.appbarLayout.viewPager);

    }


    public void setTabs()
    {
        CustomViewPagerWithTabs customViewPager=new CustomViewPagerWithTabs(getSupportFragmentManager());
        mActivityBinding.appbarLayout.tabs.viewPagerList.setAdapter(customViewPager);
        mActivityBinding.appbarLayout.tabs.tabLayout.setupWithViewPager(mActivityBinding.appbarLayout.tabs.viewPagerList);
        setTabIcons();
    }


    /**
     * set icon for tab
     */

    private void setTabIcons() {
        mActivityBinding.appbarLayout.tabs.tabLayout.getTabAt(0).setIcon(R.drawable.tab_selector_video);
        mActivityBinding.appbarLayout.tabs.tabLayout.getTabAt(1).setIcon(R.drawable.tab_selector_image);
        mActivityBinding.appbarLayout.tabs.tabLayout.getTabAt(2).setIcon(R.drawable.tab_selector_milestone);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        mActivityBinding.drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
