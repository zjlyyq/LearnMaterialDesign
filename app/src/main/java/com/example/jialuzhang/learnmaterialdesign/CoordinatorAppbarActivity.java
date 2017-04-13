package com.example.jialuzhang.learnmaterialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        toolbar.setTitle("ToolBar");
        toolbar.setNavigationIcon(R.mipmap.back);
        tabLayout.addTab(tabLayout.newTab().setText("状态"));
        tabLayout.addTab(tabLayout.newTab().setText("话题"));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1;i < 20;i ++){
            list.add("张嘉璐");
        }

        List<Fragment> fragments = new ArrayList<Fragment>();
        MapFragment fragment1 = MapFragment.newInstance(list);
        MapFragment fragment2 = MapFragment.newInstance(list);
        fragments.add(fragment1);
        fragments.add(fragment2);

        FragmentPagerAdapter adapter = new FrammentPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        //tabLayout.setTabMode();
    }
}
