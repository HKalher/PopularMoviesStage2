package com.kalher.henu.popularmovies.APIService.POJO;


import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class PopularMovieResult {
    @SerializedName ("results")
    private List<PopularMovies> MovieList;

    public PopularMovieResult(){

    }
    public PopularMovieResult(List<PopularMovies> MovieList){
        this.MovieList = MovieList;
    }

    public List<PopularMovies> getMovieList() {
        return MovieList;
    }

    public List<PopularMovies> InitializeList(){
        MovieList = new ArrayList<PopularMovies>();
        return MovieList;
    }
}
