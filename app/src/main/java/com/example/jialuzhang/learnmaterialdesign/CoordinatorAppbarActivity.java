package com.example.jialuzhang.learnmaterialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by jialuzhang on 2017/4/12.
 */

public class CoordinatorAppbarActivity extends AppCompatActivity {
    ViewPager viewPager;
    Toolbar toolbar;
    TabLayout tabLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinator_appbar);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        tabLayout = (TabLayout)findViewById(R.id.tablayout);
        toolbar = (Toolbar)findViewById(R.id.toolBar);

        tabLayout.addTab(tabLayout.newTab().setText("状态"));
        tabLayout.addTab(tabLayout.newTab().setText("话题"));
    }
}
