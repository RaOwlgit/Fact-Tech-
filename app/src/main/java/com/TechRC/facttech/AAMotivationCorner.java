package com.TechRC.facttech;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class AAMotivationCorner extends AppCompatActivity {

    HorizontalInfiniteCycleViewPager viewPager;
    List<Movie3> movieList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_a_motivation_corner);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().hide();


        initData();
        viewPager = (HorizontalInfiniteCycleViewPager) findViewById(R.id.view_pager);
        MyAdapter3 adapter = new MyAdapter3(this, movieList);
        viewPager.setAdapter(adapter);

    }

    private void initData() {
        movieList.add(new Movie3("Video No-1", getString(R.string.hindi_AA_fact_1), "https://www.youtube.com/watch?v=VlX94BFUsFQ", "Video link:", R.drawable.aa_fact_1));
        movieList.add(new Movie3("Video No-2", getString(R.string.hindi_AA_fact_2), "https://www.youtube.com/watch?v=GGwCDcq309c", "Video link:", R.drawable.aa_fact_2));

    }
}
