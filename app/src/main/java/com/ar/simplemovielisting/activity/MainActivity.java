package com.ar.simplemovielisting.activity;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ar.simplemovielisting.R;
import com.ar.simplemovielisting.adapter.PagerHomeAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    private Context context;

    private PagerAdapter adapter;
    private CharSequence pagerTitle[] = {"Popular ", "Now Playing"};
    private int numbOfTabs;

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        numbOfTabs = pagerTitle.length;
        adapter = new PagerHomeAdapter(getSupportFragmentManager(), pagerTitle, numbOfTabs);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
