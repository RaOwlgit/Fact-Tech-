package com.TechRC.facttech;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupMenu;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.melnykov.fab.FloatingActionButton;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {
    ImageSlider imageSlider;

    private InterstitialAd mInterstitialAd;
    ScrollView scrollView;
    FloatingActionButton floatingActionButton;

    Dialog myDialog, Powered_myDialog;


    private CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14,card15,card16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });



        myDialog = new Dialog(this);
        Powered_myDialog = new Dialog(this);

        imageSlider = findViewById(R.id.image_slider);

        ArrayList<SlideModel> images = new ArrayList<>();
        images.add(new SlideModel(R.drawable.gates, null));
        images.add(new SlideModel(R.drawable.pichai, null));
        images.add(new SlideModel(R.drawable.mark, null));
        images.add(new SlideModel(R.drawable.ratan, null));
        images.add(new SlideModel(R.drawable.musk, null));
        images.add(new SlideModel(R.drawable.kalam, null));
        images.add(new SlideModel(R.drawable.jobs, null));

        imageSlider.setImageList(images, ScaleTypes.CENTER_CROP);


        card1 = (CardView) findViewById(R.id.cardview1);
        card2 = (CardView) findViewById(R.id.cardview2);
        card3 = (CardView) findViewById(R.id.cardview3);
        card4 = (CardView) findViewById(R.id.cardview4);
        card5 = (CardView) findViewById(R.id.cardview5);
        card6 = (CardView) findViewById(R.id.cardview6);
        card7 = (CardView) findViewById(R.id.cardview7);
        card8 = (CardView) findViewById(R.id.cardview8);
        card9 = (CardView) findViewById(R.id.cardview9);
        card10 = (CardView) findViewById(R.id.cardview10);
        card11 = (CardView) findViewById(R.id.cardview11);
        card12 = (CardView) findViewById(R.id.cardview12);
        card13 = (CardView) findViewById(R.id.cardview13);
        card14 = (CardView) findViewById(R.id.cardview14);
        card15 = (CardView) findViewById(R.id.cardview15);
        card16 = (CardView) findViewById(R.id.cardview16);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);
        card10.setOnClickListener(this);
        card11.setOnClickListener(this);
        card12.setOnClickListener(this);
        card13.setOnClickListener(this);
        card14.setOnClickListener(this);
        card15.setOnClickListener(this);
        card16.setOnClickListener(this);


        scrollView = findViewById(R.id.Scroll);
        floatingActionButton = findViewById(R.id.up_scroll_button);


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.fullScroll(ScrollView.FOCUS_UP);
                floatingActionButton.show();
            }
        });

    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Private_Policy:
                Intent intent1 = new Intent(this, Privacy_Policy.class);
                Toast.makeText(this, "Private Policy!", Toast.LENGTH_SHORT).show();
                startActivity(intent1);
                return true;

            case R.id.Term_Condition:
                Intent intent2 = new Intent(this, Term_Condition.class);
                Toast.makeText(this, "Term Condition!", Toast.LENGTH_SHORT).show();
                startActivity(intent2);
                return true;

            case R.id.Share:
                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Fact Tech");
                    intent.putExtra(Intent.EXTRA_TEXT, "Fact Tech Stay Knowledgeable!Download now from PlayStore. link: https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName());
                    startActivity(Intent.createChooser(intent, "Share With"));
                } catch (Exception e) {
                    Toast.makeText(this, "Sorry! Unable to Share", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.Rate:
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                try {
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(this, "Sorry! Unable to Open", Toast.LENGTH_SHORT).show();
                }
                return true;

            case R.id.Powered_by:
                TextView txtclose;
                myDialog.setContentView(R.layout.powered_popup);
                txtclose = (TextView) myDialog.findViewById(R.id.textclose);
                txtclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();
                return super.onOptionsItemSelected(item);
                        }
        return true;
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Exit");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("Are you sure, You want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }


    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.cardview1:
                if (mInterstitialAd != null) {
                    save_id(card1.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, Animal.class);
                    Toast.makeText(this, "Animals!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview2:
                if (mInterstitialAd != null) {
                    save_id(card2.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, AquaticAnimal.class);
                    Toast.makeText(this, "Aquatic Animals!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview3:
                if (mInterstitialAd != null) {
                    save_id(card3.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, Birds.class);
                    Toast.makeText(this, "Birds!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview4:
                if (mInterstitialAd != null) {
                    save_id(card4.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, Plants.class);
                    Toast.makeText(this, "Plants!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview5:
                if (mInterstitialAd != null) {
                    save_id(card5.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, Car.class);
                    Toast.makeText(this, "Cars!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview6:
                if (mInterstitialAd != null) {
                    save_id(card6.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, IndianMonument.class);
                    Toast.makeText(this, "Indian Monument!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview7:
                if (mInterstitialAd != null) {
                    save_id(card7.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, ForigionMonument.class);
                    Toast.makeText(this, "Forigion Monument!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview8:
                if (mInterstitialAd != null) {
                    save_id(card8.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, Space.class);
                    Toast.makeText(this, "Space!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview9:
                if (mInterstitialAd != null) {
                    save_id(card9.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, Technology.class);
                    Toast.makeText(this, "Technology!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview10:
                if (mInterstitialAd != null) {
                    save_id(card10.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, IndianRealLifeHeros.class);
                    Toast.makeText(this, "Indian Real Life Heros!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview11:
                if (mInterstitialAd != null) {
                    save_id(card11.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, WorldRecords.class);
                    Toast.makeText(this, "World Records!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview12:
                if (mInterstitialAd != null) {
                    save_id(card12.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, SuccesFullPersons.class);
                    Toast.makeText(this, "Succes Full Persons!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview13:
                if (mInterstitialAd != null) {
                    save_id(card13.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, DidYouKnow.class);
                    Toast.makeText(this, "Did You Know!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview14:
                if (mInterstitialAd != null) {
                    save_id(card14.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, AAMotivationCorner.class);
                    Toast.makeText(this, " AA Motivation Corner!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview15:
                if (mInterstitialAd != null) {
                    save_id(card15.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, Game.class);
                    Toast.makeText(this, "Games!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;

            case R.id.cardview16:
                if (mInterstitialAd != null) {
                    save_id(card16.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    i = new Intent(this, Phychology.class);
                    Toast.makeText(this, "Phychologycal!", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    break;
                }
                break;
        }
    }

    private void save_id(int id) {
        SharedPreferences preferences = getSharedPreferences("SAVING",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("mID",id);
        editor.apply();

    }

    private int load_id(){
        SharedPreferences preferences = getSharedPreferences("SAVING",MODE_PRIVATE);
        return preferences.getInt("mID",0);
    }
    @Override
    protected void onStart(){
        super.onStart();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                AdRequest adRequest = new AdRequest.Builder().build();

                InterstitialAd.load(MainActivity.this,"ca-app-pub-3196700494551799/4141111054", adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when fullscreen content is dismissed.
                                Log.d("TAG", "The ad was dismissed.");

                                Intent intent;

                                switch (load_id()){
                                    case R.id.cardview1:
                                        intent = new Intent(MainActivity.this, Animal.class);
                                        break;

                                    case R.id.cardview2:
                                        intent = new Intent(MainActivity.this,AquaticAnimal.class);
                                        break;

                                    case R.id.cardview3:
                                        intent = new Intent(MainActivity.this, Birds.class);
                                        break;

                                    case R.id.cardview4:
                                        intent = new Intent(MainActivity.this, Plants.class);
                                        break;

                                    case R.id.cardview5:
                                        intent = new Intent(MainActivity.this, Car.class);
                                        break;

                                    case R.id.cardview6:
                                        intent = new Intent(MainActivity.this, IndianMonument.class);
                                        break;

                                    case R.id.cardview7:
                                        intent = new Intent(MainActivity.this, ForigionMonument.class);
                                        break;

                                    case R.id.cardview8:
                                        intent = new Intent(MainActivity.this, Space.class);
                                        break;

                                    case R.id.cardview9:
                                        intent = new Intent(MainActivity.this, Technology.class);
                                        break;

                                    case R.id.cardview10:
                                        intent = new Intent(MainActivity.this, IndianRealLifeHeros.class);
                                        break;

                                    case R.id.cardview11:
                                        intent = new Intent(MainActivity.this, WorldRecords.class);
                                        break;

                                    case R.id.cardview12:
                                        intent = new Intent(MainActivity.this, SuccesFullPersons.class);
                                        break;

                                    case R.id.cardview13:
                                        intent = new Intent(MainActivity.this, DidYouKnow.class);
                                        break;

                                    case R.id.cardview14:
                                        intent = new Intent(MainActivity.this, AAMotivationCorner.class);
                                        break;

                                    case R.id.cardview15:
                                        intent = new Intent(MainActivity.this, Game.class);
                                        break;

                                    case R.id.cardview16:
                                        intent = new Intent(MainActivity.this, Phychology.class);
                                        break;




                                    default:
                                        return;
                                }
                                startActivity(intent);
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when fullscreen content failed to show.
                                Log.d("TAG", "The ad failed to show.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when fullscreen content is shown.
                                // Make sure to set your reference to null so you don't
                                // show it a second time.
                                mInterstitialAd = null;
                                Log.d("TAG", "The ad was shown.");
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        mInterstitialAd = null;
                    }
                });
            }
        });

    }
}



