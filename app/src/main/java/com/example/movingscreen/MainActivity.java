 package com.example.movingscreen;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private ViewPager mViewPager;

    private SliderAdapter sliderAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.slideViewPager);

        sliderAdapter = new SliderAdapter(this);

        mViewPager.setAdapter(sliderAdapter);
    }
}
