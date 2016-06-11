package com.kalher.henu.popularmovies.APIService.POJO;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by Henu on 07/06/16.
 */
@Parcel
public class MovieTrailerResult {

    @SerializedName("results")
    private List<MovieTrailer> MovieTrailerList;

    public MovieTrailerResult(){
    }

    public MovieTrailerResult(List<MovieTrailer> MovieTrailerList){
        this.MovieTrailerList = MovieTrailerList;
    }
    public List<MovieTrailer> getMovieTrailerList(){
        Log.v("Here size", toString().valueOf(MovieTrailerList.size()));
        return MovieTrailerList;
    }
}
