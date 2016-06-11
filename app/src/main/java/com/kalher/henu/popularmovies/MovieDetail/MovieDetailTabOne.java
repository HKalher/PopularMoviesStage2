package com.kalher.henu.popularmovies.MovieDetail;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.kalher.henu.popularmovies.APIService.ApiClient;
import com.kalher.henu.popularmovies.APIService.MovieApiInterface;
import com.kalher.henu.popularmovies.APIService.POJO.MovieImages;
import com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult;
import com.kalher.henu.popularmovies.APIService.POJO.MovieReviews;
import com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult;
import com.kalher.henu.popularmovies.APIService.POJO.PopularMovies;
import com.kalher.henu.popularmovies.Adapters.BackdropAdapter;
import com.kalher.henu.popularmovies.Adapters.ReviewAdapter;
import com.kalher.henu.popularmovies.R;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MovieDetailTabOne extends Fragment {

    private RecyclerView ImageList_RecyclerView;
    private RecyclerView Review_RecyclerView;
    private boolean expand;
    private TextView description;
    private TextView viewMore;
    private int descriptionLineCount;
    private MovieImagesResult MIR;
    private MovieReviewsResult MRR;
    private Context mContext;
    private Bundle selctedMovie;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v("NOTEME One","onCreateView");

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_detail_tab_one, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.v("NOTEME One","onActivityCreated");

        super.onActivityCreated(savedInstanceState);
        mContext = getContext();
        getMovieObject(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        try{
            outState.putParcelable("MovieImageList", Parcels.wrap(MIR));
            outState.putParcelable("MovieReviewList", Parcels.wrap(MRR));
        }catch (NullPointerException e){
            outState.putParcelable("MovieImageList",null);
            outState.putParcelable("MoivewReviewList", null);
        }
        super.onSaveInstanceState(outState);
    }

    private void getMovieObject(Bundle savedInstanceState){
        PopularMovies movie;
        Intent intent  = getActivity().getIntent();
        if(intent.getBundleExtra("movieObj") == null){
            Log.v("MovieTitle"," 1 ");
            DataUtility dataUtility = new DataUtility();
            if(dataUtility.getSelectedMovie() != null){
                Log.v("MovieTitle"," 2 ");
                movie = dataUtility.getSelectedMovie();
                Log.v("MovieTitle",movie.getTitle());
                setMovieDetail(savedInstanceState,movie);
            }
        }else {
            movie = Parcels.unwrap(intent.getBundleExtra("movieObj").getParcelable("movie"));
            setMovieDetail(savedInstanceState,movie);
        }
    }

    private void APICallForBackdrops(String mid){
        MovieApiInterface service = ApiClient.getApiClient();
        Call<MovieImagesResult> call = service.getBackdrops(mid);

        call.enqueue(new Callback<MovieImagesResult>() {
            @Override
            public void onResponse(Call<MovieImagesResult> call, Response<MovieImagesResult> response) {
                MIR = response.body();
                int size = MIR.getImageResult().size();
                List<MovieImages> MI = MIR.getImageResult().subList(0,(size>10 ? 10 : size-1));
                BackdropAdapter ba = new BackdropAdapter(MI,getContext());
                ImageList_RecyclerView.setAdapter(ba);
            }

            @Override
            public void onFailure(Call<MovieImagesResult> call, Throwable t) {

            }
        });
    }
    private void APICallForReviews(String mid){
        MovieApiInterface service = ApiClient.getApiClient();
        Call<MovieReviewsResult> call = service.getMovieReviews(mid);

        call.enqueue(new Callback<MovieReviewsResult>() {
            @Override
            public void onResponse(Call<MovieReviewsResult> call, Response<MovieReviewsResult> response) {
                MRR = response.body();
                List<MovieReviews> MR = MRR.getMovieReviewsResult();
                ReviewAdapter ra = new ReviewAdapter(MR,getContext());
                Review_RecyclerView.setAdapter(ra);
            }

            @Override
            public void onFailure(Call<MovieReviewsResult> call, Throwable t) {

            }
        });
    }

    private void setMovieDetail(Bundle savedInstanceState, PopularMovies movie){
        final String mid = movie.getId();

        TextView movieDetail = (TextView) getView().findViewById(R.id.movieDetail);
        movieDetail.setText(getMovieDetail(movie));

        TextView votes = (TextView) getView().findViewById(R.id.votes);
        votes.setText("Votes " + movie.getVote_count());

        TextView ratings = (TextView) getView().findViewById(R.id.ratings);
        ratings.setText("Ratings " + movie.getVote_average() + "/10");

        RatingBar ratingBar = (RatingBar) getView().findViewById(R.id.movie_ratings);
        ratingBar.setRating(Float.parseFloat(movie.getVote_average())/2);
        // Setting color of rating stars
        LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(ContextCompat.getColor(getContext(),R.color.rating_stars), PorterDuff.Mode.SRC_ATOP);

        description = (TextView) getView().findViewById(R.id.description);
        description.setText(movie.getOverview());
        description.setMaxLines(4);

        viewMore = (TextView) getView().findViewById(R.id.viewMore);
        viewMore.setVisibility(View.INVISIBLE);

        description.post(new Runnable() {
            @Override
            public void run() {
                expand = false;
                descriptionLineCount = description.getLineCount();
                if(descriptionLineCount > 4) {
                    viewMore.setText("View More");
                    viewMore.setVisibility(View.VISIBLE);
                }
            }
        });

        viewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!expand) {
                    description.setMaxLines(Integer.MAX_VALUE);
                    viewMore.setText("View Less");
                    expand = true;
                } else {
                    description.setMaxLines(4);
                    viewMore.setText("View More");
                    expand = false;
                }
            }
        });

        // Setting backdrop images
        ImageList_RecyclerView = (RecyclerView) getView().findViewById(R.id.backdrop_image_list);
        ImageList_RecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        ImageList_RecyclerView.setLayoutManager(linearLayoutManager);

        Review_RecyclerView = (RecyclerView) getView().findViewById(R.id.review_recyclerView);  // id of the RecylcerView
        Review_RecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext());
        linearLayoutManager1.setOrientation(LinearLayoutManager.VERTICAL);
        Review_RecyclerView.setLayoutManager(linearLayoutManager1);

        if(savedInstanceState != null){
            MIR = Parcels.unwrap(savedInstanceState.getParcelable("MovieImageList"));
            MRR = Parcels.unwrap(savedInstanceState.getParcelable("MovieReviewList"));
            if(MIR != null){
                int size = MIR.getImageResult().size();
                BackdropAdapter ba = new BackdropAdapter(MIR.getImageResult().subList(0,(size>10 ? 10 : size-1)),getContext());
                ImageList_RecyclerView.setAdapter(ba);
            }else {
                APICallForBackdrops(mid);
            }
            if(MRR != null){
                ReviewAdapter ra = new ReviewAdapter(MRR.getMovieReviewsResult(), getContext());
                Review_RecyclerView.setAdapter(ra);
            }else {
                APICallForReviews(mid);
            }
        }else {
            APICallForBackdrops(mid);
            APICallForReviews(mid);
        }
    }

    private String getMovieDetail(PopularMovies movie){
        String detail;

        String release_date = movie.getRelease_date();
        release_date = release_date.substring(0,4);

        detail = release_date + " . " + getGenreString(movie) ;

        return detail;
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
