package com.kalher.henu.popularmovies.MovieDetail;

import com.kalher.henu.popularmovies.APIService.POJO.PopularMovies;

/**
 * Created by Henu on 11/06/16.
 */
public class DataUtility {
    private static PopularMovies selectedMovie;

    public void setSelectedMovie(PopularMovies selectedMovie){
        this.selectedMovie = selectedMovie;
    }

    public PopularMovies getSelectedMovie(){
        return selectedMovie;
    }
}
