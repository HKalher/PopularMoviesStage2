package com.kalher.henu.popularmovies.MovieDetail;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kalher.henu.popularmovies.APIService.POJO.PopularMovies;
import com.kalher.henu.popularmovies.R;
import com.kalher.henu.popularmovies.SlidingTab.SlidingTabLayout;
import com.kalher.henu.popularmovies.data.MovieContract;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.HashMap;

public class MovieDetailFragment extends Fragment {

    ViewPager pager;
    ViewPagerAdapter viewPagerAdapter;
    SlidingTabLayout tabs;
    CharSequence Title[] = {"Home","Trailers"};
    int NumberOfTabs = 2;
    String MovieIdForFragment;
    private PopularMovies selectedMovie;

    public MovieDetailFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("NOTEME","onCreate fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Log.v("NOTEME","onCreateView fragment");
        return inflater.inflate(R.layout.fragment_movie_detail, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.v("NOTEME","onActivityCreated fragment");

        Intent intent = getActivity().getIntent();
        PopularMovies movie;
        if(intent.getBundleExtra("movieObj")==null){
            DataUtility dataUtility = new DataUtility();
            if(dataUtility.getSelectedMovie() != null){
                movie = dataUtility.getSelectedMovie();

                setHeaderDetail(movie);
                MovieIdForFragment = movie.getId();
            }

        }else {
            movie = Parcels.unwrap(intent.getBundleExtra("movieObj").getParcelable("movie"));

            setHeaderDetail(movie);
            MovieIdForFragment = movie.getId();

        }
        viewPagerAdapter = new ViewPagerAdapter(getFragmentManager(),Title, NumberOfTabs);

        pager = (ViewPager) getView().findViewById(R.id.pager);
        pager.setAdapter(viewPagerAdapter);

        tabs = (SlidingTabLayout) getView().findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true);

        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });
        tabs.setViewPager(pager);

//        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                if(pager.getCurrentItem() == 1){
//                }
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
    }

    private void setHeaderDetail(final PopularMovies movie){
        TextView movieTitle = (TextView) getView().findViewById(R.id.movieTitle);
        movieTitle.setText(movie.getTitle());

        // setting the favourite button
        final String mid = movie.getId();

        final ImageView favImage = (ImageView) getView().findViewById(R.id.fav_button);
        favImage.setImageResource(R.drawable.ic_favorite_white_24dp);
        Cursor cursor = checkFavourite(mid);
        if(cursor.getCount()==0){
            favImage.setColorFilter(null);
        }else {
            favImage.setColorFilter(getResources().getColor(R.color.fav_red), PorterDuff.Mode.SRC_ATOP);
        }
        cursor.close();
        favImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor1 = checkFavourite(mid);
                if(cursor1.getCount()==0){
                    insertFavourite(favImage, movie);
                }else {
                    deleteFavourite(favImage, movie);
                }
                cursor1.close();
            }
        });
    }
    private Cursor checkFavourite(String mid){
        String[] slectionArgs = {mid};
        Cursor cursor = getContext().getContentResolver().query
                (
                        MovieContract.FavMovieEntry.CONTENT_URI.buildUpon().appendPath(mid).build(), // uri
                        null, // projection
                        null, // selection
                        slectionArgs, //selectionArgs
                        null // sortOrder
                );
        return cursor;
    }
    private void insertFavourite(ImageView favImage, PopularMovies movie){
        favImage.setColorFilter(getResources().getColor(R.color.fav_red), PorterDuff.Mode.SRC_ATOP);

        ContentValues values = new ContentValues();
        values.put(MovieContract.FavMovieEntry.COLUMN_TITLE,movie.getTitle());
        values.put(MovieContract.FavMovieEntry.COLUMN_POSTER_PATH,movie.getPoster_path());
        values.put(MovieContract.FavMovieEntry.COLUMN_OVERVIEW, movie.getOverview());
        values.put(MovieContract.FavMovieEntry.COLUMN_BACKDROP_PATH, movie.getBackdrop_path());
        values.put(MovieContract.FavMovieEntry.COLUMN_MOVIE_ID, movie.getId());
        values.put(MovieContract.FavMovieEntry.COLUMN_VOTE_COUNT, movie.getVote_count());
        values.put(MovieContract.FavMovieEntry.COLUMN_VOTE_AVERAGE, movie.getVote_average());
        values.put(MovieContract.FavMovieEntry.COLUMN_REALEASE_DATE, movie.getRelease_date());
        values.put(MovieContract.FavMovieEntry.COLUMN_GENRE_ID, getGenreString(movie));

        getContext().getContentResolver().insert(MovieContract.FavMovieEntry.CONTENT_URI, values);

        Toast toast = Toast.makeText(getContext().getApplicationContext(), "Added To Favourite", Toast.LENGTH_SHORT);
        toast.show();
    }
    private void deleteFavourite(ImageView favImage, PopularMovies movie){
        favImage.setColorFilter(null);
        String[] selectionArgs = {toString().valueOf(movie.getId())};
        getContext().getContentResolver().delete(MovieContract.FavMovieEntry.CONTENT_URI, MovieContract.FavMovieEntry.COLUMN_MOVIE_ID, selectionArgs);

        Toast toast = Toast.makeText(getContext().getApplicationContext(), "Removed From Favourite", Toast.LENGTH_SHORT);
        toast.show();
    }
    public String getGenreString(PopularMovies movie){
        MovieData movieData = new MovieData();
        HashMap<String,String> genreMap;
        genreMap = movieData.getGenreMap();

        ArrayList<String> genreList = movie.getGenre_ids();
        String genre="";
        int len = genreList.size();
        for(int i=0;i<len;i++){
            genre+=genreMap.get(genreList.get(i))+"/";
        }
        return genre;
    }
}
