package com.kalher.henu.popularmovies.APIService.POJO;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by Henu on 07/06/16.
 */
@Parcel
public class MovieReviewsResult {
    @SerializedName("results")
    List<MovieReviews> ReviewsResult;

    public MovieReviewsResult(){
    }

    public MovieReviewsResult(List<MovieReviews> ReviewsResult){
        this.ReviewsResult = ReviewsResult;
    }

    public List<MovieReviews> getMovieReviewsResult(){
        return ReviewsResult;
    }
}
