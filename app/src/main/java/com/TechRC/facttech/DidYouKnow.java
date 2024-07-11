package com.TechRC.facttech;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class DidYouKnow extends AppCompatActivity {

    HorizontalInfiniteCycleViewPager viewPager;
    List<Movie> movieList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_did_you_know);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().hide();


        initData();
        viewPager = (HorizontalInfiniteCycleViewPager) findViewById(R.id.view_pager);
        MyAdapter adapter = new MyAdapter(this, movieList);
        viewPager.setAdapter(adapter);
    }

    private void initData () {
        movieList.add(new Movie("Fact No-1", getString(R.string.dyn_fact_1), getString(R.string.hindi_dyn_fact_1), R.drawable.dyn_fact_1));
        movieList.add(new Movie("Fact No-2", getString(R.string.dyn_fact_2), getString(R.string.hindi_dyn_fact_2), R.drawable.dyn_fact_2));
        movieList.add(new Movie("Fact No-3", getString(R.string.dyn_fact_3), getString(R.string.hindi_dyn_fact_3), R.drawable.dyn_fact_3));
        movieList.add(new Movie("Fact No-4", getString(R.string.dyn_fact_4), getString(R.string.hindi_dyn_fact_4), R.drawable.dyn_fact_4));
        movieList.add(new Movie("Fact No-5", getString(R.string.dyn_fact_5), getString(R.string.hindi_dyn_fact_5), R.drawable.dyn_fact_5));
        movieList.add(new Movie("Fact No-6", getString(R.string.dyn_fact_6), getString(R.string.hindi_dyn_fact_6), R.drawable.dyn_fact_6));
        movieList.add(new Movie("Fact No-7", getString(R.string.dyn_fact_7), getString(R.string.hindi_dyn_fact_7), R.drawable.dyn_fact_7));
        movieList.add(new Movie("Fact No-8", getString(R.string.dyn_fact_8), getString(R.string.hindi_dyn_fact_8), R.drawable.dyn_fact_8));
        movieList.add(new Movie("Fact No-9", getString(R.string.dyn_fact_9), getString(R.string.hindi_dyn_fact_9), R.drawable.dyn_fact_9));
        movieList.add(new Movie("Fact No-10", getString(R.string.dyn_fact_10), getString(R.string.hindi_dyn_fact_10), R.drawable.dyn_fact_10));


        movieList.add(new Movie("Fact No-11", getString(R.string.dyn_fact_11), getString(R.string.hindi_dyn_fact_11), R.drawable.dyn_fact_11));
        movieList.add(new Movie("Fact No-12", getString(R.string.dyn_fact_12), getString(R.string.hindi_dyn_fact_12), R.drawable.dyn_fact_12));
        movieList.add(new Movie("Fact No-13", getString(R.string.dyn_fact_13), getString(R.string.hindi_dyn_fact_13), R.drawable.dyn_fact_13));
        movieList.add(new Movie("Fact No-14", getString(R.string.dyn_fact_14), getString(R.string.hindi_dyn_fact_14), R.drawable.dyn_fact_14));
        movieList.add(new Movie("Fact No-15", getString(R.string.dyn_fact_15), getString(R.string.hindi_dyn_fact_15), R.drawable.dyn_fact_15));
        movieList.add(new Movie("Fact No-16", getString(R.string.dyn_fact_16), getString(R.string.hindi_dyn_fact_16), R.drawable.dyn_fact_16));
        movieList.add(new Movie("Fact No-17", getString(R.string.dyn_fact_17), getString(R.string.hindi_dyn_fact_17), R.drawable.dyn_fact_17));
        movieList.add(new Movie("Fact No-18", getString(R.string.dyn_fact_18), getString(R.string.hindi_dyn_fact_18), R.drawable.dyn_fact_18));
        movieList.add(new Movie("Fact No-19", getString(R.string.dyn_fact_19), getString(R.string.hindi_dyn_fact_19), R.drawable.dyn_fact_19));
        movieList.add(new Movie("Fact No-20", getString(R.string.dyn_fact_20), getString(R.string.hindi_dyn_fact_20), R.drawable.dyn_fact_20));


        movieList.add(new Movie("Fact No-21", getString(R.string.dyn_fact_21), getString(R.string.hindi_dyn_fact_21), R.drawable.dyn_fact_21));
        movieList.add(new Movie("Fact No-22", getString(R.string.dyn_fact_22), getString(R.string.hindi_dyn_fact_22), R.drawable.dyn_fact_22));
        movieList.add(new Movie("Fact No-23", getString(R.string.dyn_fact_23), getString(R.string.hindi_dyn_fact_23), R.drawable.dyn_fact_23));
        movieList.add(new Movie("Fact No-24", getString(R.string.dyn_fact_24), getString(R.string.hindi_dyn_fact_24), R.drawable.dyn_fact_24));
        movieList.add(new Movie("Fact No-25", getString(R.string.dyn_fact_25), getString(R.string.hindi_dyn_fact_25), R.drawable.dyn_fact_25));
        movieList.add(new Movie("Fact No-26", getString(R.string.dyn_fact_26), getString(R.string.hindi_dyn_fact_2), R.drawable.dyn_fact_26));
        movieList.add(new Movie("Fact No-27", getString(R.string.dyn_fact_27), getString(R.string.hindi_dyn_fact_27), R.drawable.dyn_fact_27));
        movieList.add(new Movie("Fact No-28", getString(R.string.dyn_fact_28), getString(R.string.hindi_dyn_fact_28), R.drawable.dyn_fact_28));
        movieList.add(new Movie("Fact No-29", getString(R.string.dyn_fact_29), getString(R.string.hindi_dyn_fact_29), R.drawable.dyn_fact_29));
        movieList.add(new Movie("Fact No-30", getString(R.string.dyn_fact_30), getString(R.string.hindi_dyn_fact_30), R.drawable.dyn_fact_30));


        movieList.add(new Movie("Fact No-31", getString(R.string.dyn_fact_31), getString(R.string.hindi_dyn_fact_31), R.drawable.dyn_fact_31));
        movieList.add(new Movie("Fact No-32", getString(R.string.dyn_fact_32), getString(R.string.hindi_dyn_fact_32), R.drawable.dyn_fact_32));
        movieList.add(new Movie("Fact No-33", getString(R.string.dyn_fact_33), getString(R.string.hindi_dyn_fact_33), R.drawable.dyn_fact_33));
        movieList.add(new Movie("Fact No-34", getString(R.string.dyn_fact_34), getString(R.string.hindi_dyn_fact_34), R.drawable.dyn_fact_34));
        movieList.add(new Movie("Fact No-35", getString(R.string.dyn_fact_35), getString(R.string.hindi_dyn_fact_35), R.drawable.dyn_fact_35));
        movieList.add(new Movie("Fact No-36", getString(R.string.dyn_fact_36), getString(R.string.hindi_dyn_fact_36), R.drawable.dyn_fact_36));
        movieList.add(new Movie("Fact No-37", getString(R.string.dyn_fact_37), getString(R.string.hindi_dyn_fact_37), R.drawable.dyn_fact_37));
        movieList.add(new Movie("Fact No-38", getString(R.string.dyn_fact_38), getString(R.string.hindi_dyn_fact_38), R.drawable.dyn_fact_38));
        movieList.add(new Movie("Fact No-39", getString(R.string.dyn_fact_39), getString(R.string.hindi_dyn_fact_39), R.drawable.dyn_fact_39));
        movieList.add(new Movie("Fact No-40", getString(R.string.dyn_fact_40), getString(R.string.hindi_dyn_fact_40), R.drawable.dyn_fact_40));


        movieList.add(new Movie("Fact No-41", getString(R.string.dyn_fact_41), getString(R.string.hindi_dyn_fact_41), R.drawable.dyn_fact_41));
        movieList.add(new Movie("Fact No-42", getString(R.string.dyn_fact_42), getString(R.string.hindi_dyn_fact_42), R.drawable.dyn_fact_42));
        movieList.add(new Movie("Fact No-43", getString(R.string.dyn_fact_43), getString(R.string.hindi_dyn_fact_43), R.drawable.dyn_fact_43));
        movieList.add(new Movie("Fact No-44", getString(R.string.dyn_fact_44), getString(R.string.hindi_dyn_fact_44), R.drawable.dyn_fact_44));
        movieList.add(new Movie("Fact No-45", getString(R.string.dyn_fact_45), getString(R.string.hindi_dyn_fact_45), R.drawable.dyn_fact_45));
        movieList.add(new Movie("Fact No-46", getString(R.string.dyn_fact_46), getString(R.string.hindi_dyn_fact_46), R.drawable.dyn_fact_46));
        movieList.add(new Movie("Fact No-47", getString(R.string.dyn_fact_47), getString(R.string.hindi_dyn_fact_47), R.drawable.dyn_fact_47));
        movieList.add(new Movie("Fact No-48", getString(R.string.dyn_fact_48), getString(R.string.hindi_dyn_fact_48), R.drawable.dyn_fact_48));
        movieList.add(new Movie("Fact No-49", getString(R.string.dyn_fact_49), getString(R.string.hindi_dyn_fact_49), R.drawable.dyn_fact_49));
        movieList.add(new Movie("Fact No-50", getString(R.string.dyn_fact_50), getString(R.string.hindi_dyn_fact_50), R.drawable.dyn_fact_50));


        movieList.add(new Movie("Fact No-51", getString(R.string.dyn_fact_51), getString(R.string.hindi_dyn_fact_51), R.drawable.dyn_fact_51));
        movieList.add(new Movie("Fact No-52", getString(R.string.dyn_fact_52), getString(R.string.hindi_dyn_fact_52), R.drawable.dyn_fact_52));
        movieList.add(new Movie("Fact No-53", getString(R.string.dyn_fact_53), getString(R.string.hindi_dyn_fact_53), R.drawable.dyn_fact_53));
        movieList.add(new Movie("Fact No-54", getString(R.string.dyn_fact_54), getString(R.string.hindi_dyn_fact_54), R.drawable.dyn_fact_54));
        movieList.add(new Movie("Fact No-55", getString(R.string.dyn_fact_55), getString(R.string.hindi_dyn_fact_55), R.drawable.dyn_fact_55));
        movieList.add(new Movie("Fact No-56", getString(R.string.dyn_fact_56), getString(R.string.hindi_dyn_fact_56), R.drawable.dyn_fact_56));
        movieList.add(new Movie("Fact No-57", getString(R.string.dyn_fact_57), getString(R.string.hindi_dyn_fact_57), R.drawable.dyn_fact_57));
        movieList.add(new Movie("Fact No-58", getString(R.string.dyn_fact_58), getString(R.string.hindi_dyn_fact_58), R.drawable.dyn_fact_58));
        movieList.add(new Movie("Fact No-59", getString(R.string.dyn_fact_59), getString(R.string.hindi_dyn_fact_59), R.drawable.dyn_fact_59));
        movieList.add(new Movie("Fact No-60", getString(R.string.dyn_fact_60), getString(R.string.hindi_dyn_fact_60), R.drawable.dyn_fact_60));


        movieList.add(new Movie("Fact No-61", getString(R.string.dyn_fact_61), getString(R.string.hindi_dyn_fact_61), R.drawable.dyn_fact_61));
        movieList.add(new Movie("Fact No-62", getString(R.string.dyn_fact_62), getString(R.string.hindi_dyn_fact_62), R.drawable.dyn_fact_62));
        movieList.add(new Movie("Fact No-63", getString(R.string.dyn_fact_63), getString(R.string.hindi_dyn_fact_63), R.drawable.dyn_fact_63));
        movieList.add(new Movie("Fact No-64", getString(R.string.dyn_fact_64), getString(R.string.hindi_dyn_fact_64), R.drawable.dyn_fact_64));
        movieList.add(new Movie("Fact No-65", getString(R.string.dyn_fact_65), getString(R.string.hindi_dyn_fact_65), R.drawable.dyn_fact_65));
        movieList.add(new Movie("Fact No-66", getString(R.string.dyn_fact_66), getString(R.string.hindi_dyn_fact_66), R.drawable.dyn_fact_66));
        movieList.add(new Movie("Fact No-67", getString(R.string.dyn_fact_67), getString(R.string.hindi_dyn_fact_67), R.drawable.dyn_fact_67));
        movieList.add(new Movie("Fact No-68", getString(R.string.dyn_fact_68), getString(R.string.hindi_dyn_fact_68), R.drawable.dyn_fact_68));
        movieList.add(new Movie("Fact No-69", getString(R.string.dyn_fact_69), getString(R.string.hindi_dyn_fact_69), R.drawable.dyn_fact_69));
        movieList.add(new Movie("Fact No-70", getString(R.string.dyn_fact_70), getString(R.string.hindi_dyn_fact_70), R.drawable.dyn_fact_70));


        movieList.add(new Movie("Fact No-71", getString(R.string.dyn_fact_71), getString(R.string.hindi_dyn_fact_71), R.drawable.dyn_fact_71));
        movieList.add(new Movie("Fact No-72", getString(R.string.dyn_fact_72), getString(R.string.hindi_dyn_fact_72), R.drawable.dyn_fact_72));
        movieList.add(new Movie("Fact No-73", getString(R.string.dyn_fact_73), getString(R.string.hindi_dyn_fact_73), R.drawable.dyn_fact_73));
        movieList.add(new Movie("Fact No-74", getString(R.string.dyn_fact_74), getString(R.string.hindi_dyn_fact_74), R.drawable.dyn_fact_74));
        movieList.add(new Movie("Fact No-75", getString(R.string.dyn_fact_75), getString(R.string.hindi_dyn_fact_75), R.drawable.dyn_fact_75));
        movieList.add(new Movie("Fact No-76", getString(R.string.dyn_fact_76), getString(R.string.hindi_dyn_fact_76), R.drawable.dyn_fact_76));
        movieList.add(new Movie("Fact No-77", getString(R.string.dyn_fact_77), getString(R.string.hindi_dyn_fact_77), R.drawable.dyn_fact_77));
        movieList.add(new Movie("Fact No-78", getString(R.string.dyn_fact_78), getString(R.string.hindi_dyn_fact_78), R.drawable.dyn_fact_78));
        movieList.add(new Movie("Fact No-79", getString(R.string.dyn_fact_79), getString(R.string.hindi_dyn_fact_79), R.drawable.dyn_fact_79));
        movieList.add(new Movie("Fact No-80", getString(R.string.dyn_fact_80), getString(R.string.hindi_dyn_fact_80), R.drawable.dyn_fact_80));


        movieList.add(new Movie("Fact No-81", getString(R.string.dyn_fact_81), getString(R.string.hindi_dyn_fact_81), R.drawable.dyn_fact_81));
        movieList.add(new Movie("Fact No-82", getString(R.string.dyn_fact_82), getString(R.string.hindi_dyn_fact_82), R.drawable.dyn_fact_82));
        movieList.add(new Movie("Fact No-83", getString(R.string.dyn_fact_83), getString(R.string.hindi_dyn_fact_83), R.drawable.dyn_fact_83));
        movieList.add(new Movie("Fact No-84", getString(R.string.dyn_fact_84), getString(R.string.hindi_dyn_fact_84), R.drawable.dyn_fact_84));
        movieList.add(new Movie("Fact No-85", getString(R.string.dyn_fact_85), getString(R.string.hindi_dyn_fact_85), R.drawable.dyn_fact_85));
        movieList.add(new Movie("Fact No-86", getString(R.string.dyn_fact_86), getString(R.string.hindi_dyn_fact_86), R.drawable.dyn_fact_86));
        movieList.add(new Movie("Fact No-87", getString(R.string.dyn_fact_87), getString(R.string.hindi_dyn_fact_87), R.drawable.dyn_fact_87));
        movieList.add(new Movie("Fact No-88", getString(R.string.dyn_fact_88), getString(R.string.hindi_dyn_fact_88), R.drawable.dyn_fact_88));
        movieList.add(new Movie("Fact No-89", getString(R.string.dyn_fact_89), getString(R.string.hindi_dyn_fact_89), R.drawable.dyn_fact_89));
        movieList.add(new Movie("Fact No-90", getString(R.string.dyn_fact_90), getString(R.string.hindi_dyn_fact_90), R.drawable.dyn_fact_90));

        movieList.add(new Movie("Fact No-91", getString(R.string.dyn_fact_91), getString(R.string.hindi_dyn_fact_91), R.drawable.dyn_fact_91));
        movieList.add(new Movie("Fact No-92", getString(R.string.dyn_fact_92), getString(R.string.hindi_dyn_fact_92), R.drawable.dyn_fact_92));
        movieList.add(new Movie("Fact No-93", getString(R.string.dyn_fact_93), getString(R.string.hindi_dyn_fact_93), R.drawable.dyn_fact_93));
        movieList.add(new Movie("Fact No-94", getString(R.string.dyn_fact_94), getString(R.string.hindi_dyn_fact_94), R.drawable.dyn_fact_94));
        movieList.add(new Movie("Fact No-95", getString(R.string.dyn_fact_95), getString(R.string.hindi_dyn_fact_95), R.drawable.dyn_fact_95));
        movieList.add(new Movie("Fact No-96", getString(R.string.dyn_fact_96), getString(R.string.hindi_dyn_fact_96), R.drawable.dyn_fact_96));
        movieList.add(new Movie("Fact No-97", getString(R.string.dyn_fact_97), getString(R.string.hindi_dyn_fact_97), R.drawable.dyn_fact_97));
        movieList.add(new Movie("Fact No-98", getString(R.string.dyn_fact_98), getString(R.string.hindi_dyn_fact_98), R.drawable.dyn_fact_98));
        movieList.add(new Movie("Fact No-99", getString(R.string.dyn_fact_99), getString(R.string.hindi_dyn_fact_99), R.drawable.dyn_fact_99));
        movieList.add(new Movie("Fact No-100", getString(R.string.dyn_fact_100), getString(R.string.hindi_dyn_fact_100), R.drawable.dyn_fact_100));

    }

}
