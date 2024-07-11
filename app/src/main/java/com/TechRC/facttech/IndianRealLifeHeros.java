package com.TechRC.facttech;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class IndianRealLifeHeros extends AppCompatActivity {


    HorizontalInfiniteCycleViewPager viewPager;
    List<Movie3> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_real_life_heros);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().hide();

        initData();
        viewPager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.view_pager);
        MyAdapter3 adapter = new MyAdapter3(this,movieList);
        viewPager.setAdapter(adapter);

    }

    private void initData() {

        movieList.add(new Movie3("Hero No-1(PVC)",getString(R.string.hindi_heros_fact_1),"","",R.drawable.heros_fact_1));
        movieList.add(new Movie3("Hero No-2(PVC)",getString(R.string.hindi_heros_fact_2),"","",R.drawable.heros_fact_2));
        movieList.add(new Movie3("Hero No-3(PVC)",getString(R.string.hindi_heros_fact_3),"","",R.drawable.heros_fact_3));
        movieList.add(new Movie3("Hero No-4(PVC)",getString(R.string.hindi_heros_fact_4),"","",R.drawable.heros_fact_4));
        movieList.add(new Movie3("Hero No-5(PVC)",getString(R.string.hindi_heros_fact_5),"","",R.drawable.heros_fact_5));
        movieList.add(new Movie3("Hero No-6(PVC)",getString(R.string.hindi_heros_fact_6),"","",R.drawable.heros_fact_6));
        movieList.add(new Movie3("Hero No-7(PVC)",getString(R.string.hindi_heros_fact_7),"","",R.drawable.heros_fact_7));
        movieList.add(new Movie3("Hero No-8(PVC)",getString(R.string.hindi_heros_fact_8),"","",R.drawable.heros_fact_8));
        movieList.add(new Movie3("Hero No-9(PVC)",getString(R.string.hindi_heros_fact_9),"","",R.drawable.heros_fact_9));
        movieList.add(new Movie3("Hero No-10(PVC)",getString(R.string.hindi_heros_fact_10),"","",R.drawable.heros_fact_10));


        movieList.add(new Movie3("Hero No-11(PVC)",getString(R.string.hindi_heros_fact_11),"","",R.drawable.heros_fact_11));
        movieList.add(new Movie3("Hero No-12(PVC)",getString(R.string.hindi_heros_fact_12),"","",R.drawable.heros_fact_12));
        movieList.add(new Movie3("Hero No-13(PVC)",getString(R.string.hindi_heros_fact_13),"","",R.drawable.heros_fact_13));
        movieList.add(new Movie3("Hero No-14(PVC)",getString(R.string.hindi_heros_fact_14),"","",R.drawable.heros_fact_14));
        movieList.add(new Movie3("Hero No-15(PVC)",getString(R.string.hindi_heros_fact_15),"","",R.drawable.heros_fact_15));
        movieList.add(new Movie3("Hero No-16(PVC)",getString(R.string.hindi_heros_fact_16),"","",R.drawable.heros_fact_16));
        movieList.add(new Movie3("Hero No-17(PVC)",getString(R.string.hindi_heros_fact_17),"","",R.drawable.heros_fact_17));
        movieList.add(new Movie3("Hero No-18(PVC)",getString(R.string.hindi_heros_fact_18),"","",R.drawable.heros_fact_18));
        movieList.add(new Movie3("Hero No-19(PVC)",getString(R.string.hindi_heros_fact_19),"","",R.drawable.heros_fact_19));
        movieList.add(new Movie3("Hero No-20(PVC)",getString(R.string.hindi_heros_fact_20),"","",R.drawable.heros_fact_20));


        movieList.add(new Movie3("Hero No-21(PVC)",getString(R.string.hindi_heros_fact_21),"","",R.drawable.heros_fact_21));
        movieList.add(new Movie3("Hero No-22(SC)",getString(R.string.hindi_heros_fact_22),"","",R.drawable.heros_fact_22));
        movieList.add(new Movie3("Hero No-23(AC)",getString(R.string.hindi_heros_fact_23),"","",R.drawable.heros_fact_23));
        movieList.add(new Movie3("Hero No-24(MVC)",getString(R.string.hindi_heros_fact_24),"","",R.drawable.heros_fact_24));
        movieList.add(new Movie3("Hero No-25(MVC)",getString(R.string.hindi_heros_fact_25),"","",R.drawable.heros_fact_25));
        movieList.add(new Movie3("Hero No-26(VC)",getString(R.string.hindi_heros_fact_26),"","",R.drawable.heros_fact_26));
        movieList.add(new Movie3("Hero No-27(MVC)",getString(R.string.hindi_heros_fact_27),"","",R.drawable.heros_fact_27));
        movieList.add(new Movie3("Hero No-28(KC)",getString(R.string.hindi_heros_fact_28),"","",R.drawable.heros_fact_28));
        movieList.add(new Movie3("Hero No-29(MVC)",getString(R.string.hindi_heros_fact_29),"","",R.drawable.heros_fact_29));
        movieList.add(new Movie3("Hero No-30(MVC)",getString(R.string.hindi_heros_fact_30),"","",R.drawable.heros_fact_30));




        movieList.add(new Movie3("Hero No-31(MVC)", getString(R.string.hindi_heros_fact_31),"","", R.drawable.heros_fact_31));
        movieList.add(new Movie3("Hero No-32(MVC)", getString(R.string.hindi_heros_fact_32),"","", R.drawable.heros_fact_32));
        movieList.add(new Movie3("Hero No-33(MVC)", getString(R.string.hindi_heros_fact_33),"","", R.drawable.heros_fact_33));
        movieList.add(new Movie3("Hero No-34(MVC)", getString(R.string.hindi_heros_fact_34),"","", R.drawable.heros_fact_34));
        movieList.add(new Movie3("Hero No-35(MVC)", getString(R.string.hindi_heros_fact_35),"","", R.drawable.heros_fact_35));
        movieList.add(new Movie3("Hero No-36(MVC)", getString(R.string.hindi_heros_fact_36),"","", R.drawable.heros_fact_36));
        movieList.add(new Movie3("Hero No-37(MVC)", getString(R.string.hindi_heros_fact_37),"","", R.drawable.heros_fact_37));
        movieList.add(new Movie3("Hero No-38(MVC)", getString(R.string.hindi_heros_fact_38),"","", R.drawable.heros_fact_38));
        movieList.add(new Movie3("Hero No-39(MVC)", getString(R.string.hindi_heros_fact_39),"","", R.drawable.heros_fact_39));
        movieList.add(new Movie3("Hero No-40(MVC)", getString(R.string.hindi_heros_fact_40),"","", R.drawable.heros_fact_40));



        movieList.add(new Movie3("Hero No-41(MVC)", getString(R.string.hindi_heros_fact_41),"","", R.drawable.heros_fact_41));
        movieList.add(new Movie3("Hero No-42(MVC)", getString(R.string.hindi_heros_fact_42),"","", R.drawable.heros_fact_42));
        movieList.add(new Movie3("Hero No-43(MVC)", getString(R.string.hindi_heros_fact_43),"","", R.drawable.heros_fact_43));
        movieList.add(new Movie3("Hero No-44(MVC)", getString(R.string.hindi_heros_fact_44),"","", R.drawable.heros_fact_44));
        movieList.add(new Movie3("Hero No-45(MVC)", getString(R.string.hindi_heros_fact_45),"","", R.drawable.heros_fact_45));
        movieList.add(new Movie3("Hero No-46(MVC)", getString(R.string.hindi_heros_fact_46),"","", R.drawable.heros_fact_46));
        movieList.add(new Movie3("Hero No-47(MVC)", getString(R.string.hindi_heros_fact_47),"","", R.drawable.heros_fact_47));
        movieList.add(new Movie3("Hero No-48(MVC)",getString(R.string.hindi_heros_fact_48),"","", R.drawable.heros_fact_48));
        movieList.add(new Movie3("Hero No-49(MVC)", getString(R.string.hindi_heros_fact_49),"","", R.drawable.heros_fact_49));
        movieList.add(new Movie3("Hero No-50(MVC)", getString(R.string.hindi_heros_fact_50),"","", R.drawable.heros_fact_50));
    }
}