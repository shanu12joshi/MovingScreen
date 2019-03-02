package com.example.movingscreen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.movingscreen.R;

public class SliderAdapter extends PagerAdapter {


    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){

        this.context =  context;
    }


    public int [] slideImages = {
            R.drawable.imperialdreams,
            R.drawable.arq,
            R.drawable.bluejay
    };


    public String[] stringDecs = {

            "A 21-year-old reformed gangster Bambi's devotion to his family, particularly his son Daytone, and his family's future are put to the test when he is released from prison and returns to his violent old stomping grounds in Watts, Los Angeles"
            , "A 21-year-old reformed gangster Bambi's devotion to his family, particularly his son Daytone, and his family's future are put to the test when he is released from prison and returns to his violent old stomping grounds in Watts, Los Angeles"
            , "A 21-year-old reformed gangster Bambi's devotion to his family, particularly his son Daytone, and his family's future are put to the test when he is released from prison and returns to his violent old stomping grounds in Watts, Los Angeles"
    };


    @Override
    public int getCount() {
        return slideImages.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {


        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view =  layoutInflater.inflate(R.layout.slid_layout, container,false);

        ImageView sliderImage =  view.findViewById(R.id.slideViewPager);
        TextView textView =  view.findViewById(R.id.textView1);

        sliderImage.setImageResource(slideImages[position]);
        textView.setText(stringDecs[position]);


        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}


