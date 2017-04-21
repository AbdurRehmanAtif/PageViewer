package com.vv.abd_ur_rehmanatif.pageviewer;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    ViewPager ViewPager;
     CoustomSwipAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager = (ViewPager)findViewById(R.id.ViewPager);
    adapter = new CoustomSwipAdapter(this);
        ViewPager.setAdapter(adapter);


    }
}
