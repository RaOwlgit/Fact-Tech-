package com.TechRC.facttech;

import android.content.Context;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.airbnb.lottie.LottieAnimationView;

import java.util.List;

import static android.content.Context.VIBRATOR_SERVICE;

public class MyAdapter extends PagerAdapter {
    private boolean switchOn = false;

    Vibrator vibrator;

    Context context;
    List<Movie> movieList;


    public MyAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object O) {
        return view.equals(O);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item,container,false);

        ImageView movie_image = (ImageView)view.findViewById(R.id.movie_image);
        TextView movie_title = (TextView)view.findViewById(R.id.movie_title);
        TextView movie_description = (TextView)view.findViewById(R.id.movie_description);
        TextView movie_hindidescription = (TextView)view.findViewById(R.id.movie_hindidescription);
        LottieAnimationView bookmark = (LottieAnimationView) view.findViewById(R.id.bookmark);
        vibrator = (Vibrator) context.getSystemService(VIBRATOR_SERVICE);

        movie_image.setImageResource(movieList.get(position).getImage());
        movie_title.setText(movieList.get(position).getName());
        movie_description.setText(movieList.get(position).getDescription());
        movie_hindidescription.setText(movieList.get(position).getHindiDescription());


        bookmark.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view) {
                if (switchOn){
                       bookmark.setMinAndMaxProgress(0.0f,0.5f); bookmark.playAnimation();switchOn = false;
                       Toast.makeText(context,"Bookmark added!", Toast.LENGTH_SHORT).show();
                       vibrator.vibrate(280);

            }else  {
                    bookmark.setMinAndMaxProgress(0.0f,0.5f); bookmark.playAnimation();switchOn = true;
                    Toast.makeText(context,"Bookmark added!", Toast.LENGTH_SHORT).show();
                    vibrator.vibrate(280);
              }
       }

        });
        container.addView(view);
        return view;


    }
}
