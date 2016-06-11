package com.kalher.henu.popularmovies;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.kalher.henu.popularmovies.Adapters.MyAdapter;
import com.kalher.henu.popularmovies.MovieDetail.MovieDetailFragment;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnSelectionChangedListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        View view = this.getWindow().getDecorView();
        Context context = getBaseContext();
        view.setBackgroundColor(ContextCompat.getColor(context,R.color.background));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        MainActivityFragment mainActivityFragment = (MainActivityFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);

        switch (id){
            case R.id.popular_movies:
                mainActivityFragment.APICall("popular_movies");
                break;
            case R.id.highest_rated:
                mainActivityFragment.APICall("highest_rated");
                break;
            case R.id.favourite_movie:
                mainActivityFragment.InflateFavouriteMoviesList();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemChange(){
        Log.v("NOTEME","OnSelectionItemChangeListener");

        MovieDetailFragment movieDetailFragment = new MovieDetailFragment();
//        movieDetailFragment.setArguments(movieObj);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.movie_detail_container, movieDetailFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
