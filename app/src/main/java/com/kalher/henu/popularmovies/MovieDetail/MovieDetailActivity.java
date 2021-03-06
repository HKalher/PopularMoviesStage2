package com.kalher.henu.popularmovies.MovieDetail;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.kalher.henu.popularmovies.R;


public class MovieDetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v("NOTEME","onCreate activity");

//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);   // to hide the action bar/title bar
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);    // to make the activity full screen

        setContentView(R.layout.activity_movie_detail);
        if(Build.VERSION.SDK_INT >= 21){
            getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.statusBarColor));
        }
    }

}
