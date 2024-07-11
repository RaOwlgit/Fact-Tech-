package com.TechRC.facttech;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class IndianMonument extends AppCompatActivity {

    HorizontalInfiniteCycleViewPager viewPager;
    List<Movie> movieList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_monument);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().hide();


        initData();
        viewPager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.view_pager);
        MyAdapter adapter = new MyAdapter(this,movieList);
        viewPager.setAdapter(adapter);

    }

    private void initData() {


        movieList.add(new Movie("Fact No-1",getString(R.string.indian_fact_1),getString(R.string.hindi_indian_fact_1),R.drawable.indian_fact_1));
        movieList.add(new Movie("Fact No-2",getString(R.string.indian_fact_2),getString(R.string.hindi_indian_fact_2),R.drawable.indian_fact_2));
        movieList.add(new Movie("Fact No-3",getString(R.string.indian_fact_3),getString(R.string.hindi_indian_fact_3),R.drawable.indian_fact_3));
        movieList.add(new Movie("Fact No-4",getString(R.string.indian_fact_4),getString(R.string.hindi_indian_fact_4),R.drawable.indian_fact_4));
        movieList.add(new Movie("Fact No-5",getString(R.string.indian_fact_5),getString(R.string.hindi_indian_fact_5),R.drawable.indian_fact_5));
        movieList.add(new Movie("Fact No-6",getString(R.string.indian_fact_6),getString(R.string.hindi_indian_fact_6),R.drawable.indian_fact_6));
        movieList.add(new Movie("Fact No-7",getString(R.string.indian_fact_7),getString(R.string.hindi_indian_fact_7),R.drawable.indian_fact_7));
        movieList.add(new Movie("Fact No-8",getString(R.string.indian_fact_8),getString(R.string.hindi_indian_fact_8),R.drawable.indian_fact_8));
        movieList.add(new Movie("Fact No-9",getString(R.string.indian_fact_9),getString(R.string.hindi_indian_fact_9),R.drawable.indian_fact_9));
        movieList.add(new Movie("Fact No-10",getString(R.string.indian_fact_10),getString(R.string.hindi_indian_fact_10),R.drawable.indian_fact_10));


        movieList.add(new Movie("Fact No-11",getString(R.string.indian_fact_11),getString(R.string.hindi_indian_fact_11),R.drawable.indian_fact_11));
        movieList.add(new Movie("Fact No-12",getString(R.string.indian_fact_12),getString(R.string.hindi_indian_fact_12),R.drawable.indian_fact_12));
        movieList.add(new Movie("Fact No-13",getString(R.string.indian_fact_13),getString(R.string.hindi_indian_fact_13),R.drawable.indian_fact_13));
        movieList.add(new Movie("Fact No-14",getString(R.string.indian_fact_14),getString(R.string.hindi_indian_fact_14),R.drawable.indian_fact_14));
        movieList.add(new Movie("Fact No-15",getString(R.string.indian_fact_15),getString(R.string.hindi_indian_fact_15),R.drawable.indian_fact_15));
        movieList.add(new Movie("Fact No-16",getString(R.string.indian_fact_16),getString(R.string.hindi_indian_fact_16),R.drawable.indian_fact_16));
        movieList.add(new Movie("Fact No-17",getString(R.string.indian_fact_17),getString(R.string.hindi_indian_fact_17),R.drawable.indian_fact_17));
        movieList.add(new Movie("Fact No-18",getString(R.string.indian_fact_18),getString(R.string.hindi_indian_fact_18),R.drawable.indian_fact_18));
        movieList.add(new Movie("Fact No-19",getString(R.string.indian_fact_19),getString(R.string.hindi_indian_fact_19),R.drawable.indian_fact_19));
        movieList.add(new Movie("Fact No-20",getString(R.string.indian_fact_20),getString(R.string.hindi_indian_fact_20),R.drawable.indian_fact_20));


        movieList.add(new Movie("Fact No-21",getString(R.string.indian_fact_21),getString(R.string.hindi_indian_fact_21),R.drawable.indian_fact_21));
        movieList.add(new Movie("Fact No-22",getString(R.string.indian_fact_22),getString(R.string.hindi_indian_fact_22),R.drawable.indian_fact_22));
        movieList.add(new Movie("Fact No-23",getString(R.string.indian_fact_23),getString(R.string.hindi_indian_fact_23),R.drawable.indian_fact_23));
        movieList.add(new Movie("Fact No-24",getString(R.string.indian_fact_24),getString(R.string.hindi_indian_fact_24),R.drawable.indian_fact_24));
        movieList.add(new Movie("Fact No-25",getString(R.string.indian_fact_25),getString(R.string.hindi_indian_fact_25),R.drawable.indian_fact_25));
        movieList.add(new Movie("Fact No-26",getString(R.string.indian_fact_26),getString(R.string.hindi_indian_fact_26),R.drawable.indian_fact_26));
        movieList.add(new Movie("Fact No-27",getString(R.string.indian_fact_27),getString(R.string.hindi_indian_fact_27),R.drawable.indian_fact_27));
        movieList.add(new Movie("Fact No-28",getString(R.string.indian_fact_28),getString(R.string.hindi_indian_fact_28),R.drawable.indian_fact_28));
        movieList.add(new Movie("Fact No-29",getString(R.string.indian_fact_29),getString(R.string.hindi_indian_fact_29),R.drawable.indian_fact_29));
        movieList.add(new Movie("Fact No-30",getString(R.string.indian_fact_30),getString(R.string.hindi_indian_fact_30),R.drawable.indian_fact_30));




        movieList.add(new Movie("Fact No-31", getString(R.string.indian_fact_31), getString(R.string.hindi_indian_fact_31), R.drawable.indian_fact_31));
        movieList.add(new Movie("Fact No-32", getString(R.string.indian_fact_32), getString(R.string.hindi_indian_fact_32), R.drawable.indian_fact_32));
        movieList.add(new Movie("Fact No-33", getString(R.string.indian_fact_33), getString(R.string.hindi_indian_fact_33), R.drawable.indian_fact_33));
        movieList.add(new Movie("Fact No-34", getString(R.string.indian_fact_34), getString(R.string.hindi_indian_fact_34), R.drawable.indian_fact_34));
        movieList.add(new Movie("Fact No-35", getString(R.string.indian_fact_35), getString(R.string.hindi_indian_fact_35), R.drawable.indian_fact_35));
        movieList.add(new Movie("Fact No-36", getString(R.string.indian_fact_36), getString(R.string.hindi_indian_fact_36), R.drawable.indian_fact_36));
        movieList.add(new Movie("Fact No-37", getString(R.string.indian_fact_37), getString(R.string.hindi_indian_fact_37), R.drawable.indian_fact_37));
        movieList.add(new Movie("Fact No-38", getString(R.string.indian_fact_38), getString(R.string.hindi_indian_fact_38), R.drawable.indian_fact_38));
        movieList.add(new Movie("Fact No-39", getString(R.string.indian_fact_39), getString(R.string.hindi_indian_fact_39), R.drawable.indian_fact_39));
        movieList.add(new Movie("Fact No-40", getString(R.string.indian_fact_40), getString(R.string.hindi_indian_fact_40), R.drawable.indian_fact_40));



        movieList.add(new Movie("Fact No-41", getString(R.string.indian_fact_41), getString(R.string.hindi_indian_fact_41), R.drawable.indian_fact_41));
        movieList.add(new Movie("Fact No-42", getString(R.string.indian_fact_42), getString(R.string.hindi_indian_fact_42), R.drawable.indian_fact_42));
        movieList.add(new Movie("Fact No-43", getString(R.string.indian_fact_43), getString(R.string.hindi_indian_fact_43), R.drawable.indian_fact_43));
        movieList.add(new Movie("Fact No-44", getString(R.string.indian_fact_44), getString(R.string.hindi_indian_fact_44), R.drawable.indian_fact_44));
        movieList.add(new Movie("Fact No-45", getString(R.string.indian_fact_45), getString(R.string.hindi_indian_fact_45), R.drawable.indian_fact_45));
        movieList.add(new Movie("Fact No-46", getString(R.string.indian_fact_46), getString(R.string.hindi_indian_fact_46), R.drawable.indian_fact_46));
        movieList.add(new Movie("Fact No-47", getString(R.string.indian_fact_47), getString(R.string.hindi_indian_fact_47), R.drawable.indian_fact_47));
        movieList.add(new Movie("Fact No-48", getString(R.string.indian_fact_48), getString(R.string.hindi_indian_fact_48), R.drawable.indian_fact_48));
        movieList.add(new Movie("Fact No-49", getString(R.string.indian_fact_49), getString(R.string.hindi_indian_fact_49), R.drawable.indian_fact_49));
        movieList.add(new Movie("Fact No-50", getString(R.string.indian_fact_50), getString(R.string.hindi_indian_fact_50), R.drawable.indian_fact_50));
    }
}