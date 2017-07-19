package com.spotspoon;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.spotspoon.databinding.ActivityMainBinding;

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
        getSupportActionBar().setTitle(R.string.title_home);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        mActivityBinding.drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
