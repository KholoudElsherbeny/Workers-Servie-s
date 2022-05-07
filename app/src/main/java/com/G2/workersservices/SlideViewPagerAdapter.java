package com.G2.workersservices;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideViewPagerAdapter extends PagerAdapter {

    Context ctx;

    public SlideViewPagerAdapter(Context ctx) {
        this.ctx = ctx;
    }
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater= (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_screen,container,false);
        ImageView logo=view.findViewById(R.id.logo);
        ImageView ind1=view.findViewById(R.id.ind1);
        ImageView ind2=view.findViewById(R.id.ind2);
        ImageView ind3=view.findViewById(R.id.ind3);
        ImageView ind4=view.findViewById(R.id.ind4);

        TextView desc=view.findViewById(R.id.desc);
        ImageView next=view.findViewById(R.id.next);
        ImageView back=view.findViewById(R.id.back);
        Button BtnGetStarted=view.findViewById(R.id.BtnGetStarted);
        BtnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ctx,MainActivity.class);
                intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
                ctx.startActivity(intent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SlideActivity.viewPager.setCurrentItem(position+1);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SlideActivity.viewPager.setCurrentItem(position-1);

            }
        });
        switch (position){
            case 0:
                logo.setImageResource(R.drawable.logo);
                ind1.setImageResource(R.drawable.unselected);
                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.unselected);
                ind4.setImageResource(R.drawable.selected);

                desc.setText("The App For All Your Needs");
                back.setVisibility(View.GONE);
                break;
            case 1:
                logo.setImageResource(R.drawable.phone_view_1);
                ind1.setImageResource(R.drawable.unselected);
                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.selected);
                ind4.setImageResource(R.drawable.unselected);

                desc.setText("Select your order`s category");
                break;
            case 2:
                logo.setImageResource(R.drawable.phone_view_2);
                ind1.setImageResource(R.drawable.unselected);
                ind2.setImageResource(R.drawable.selected);
                ind3.setImageResource(R.drawable.unselected);
                ind4.setImageResource(R.drawable.unselected);

                desc.setText("Specify your unit type");
                break;
            case 3:
                logo.setImageResource(R.drawable.phone_view_3);
                ind1.setImageResource(R.drawable.selected);
                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.unselected);
                ind4.setImageResource(R.drawable.unselected);

                desc.setText("Choose your service type");
                next.setVisibility(View.GONE);
                break;



        }
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}


