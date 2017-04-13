package com.example.jialuzhang.learnmaterialdesign.CollapsingToolbarLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

import com.example.jialuzhang.learnmaterialdesign.R;

/**
 * Created by jialuzhang on 2017/4/13.
 */

public class CollapsingToolbarLayoutActivity extends AppCompatActivity {
    private CollapsingToolbarLayout mCollapsingToolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collapsingtoolbarlayout);
        mCollapsingToolbar = (CollapsingToolbarLayout)findViewById(R.id.collapsingToolbarLayout);

        mCollapsingToolbar.setTitle("这才是TITLE");
        mCollapsingToolbar.setExpandedTitleColor(Color.WHITE);
    }
}
