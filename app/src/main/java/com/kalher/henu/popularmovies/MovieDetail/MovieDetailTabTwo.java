package com.kalher.henu.popularmovies.MovieDetail;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kalher.henu.popularmovies.APIService.ApiClient;
import com.kalher.henu.popularmovies.APIService.MovieApiInterface;
import com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer;
import com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult;
import com.kalher.henu.popularmovies.APIService.POJO.PopularMovies;
import com.kalher.henu.popularmovies.Adapters.TrailerAdapter;
import com.kalher.henu.popularmovies.R;

import org.parceler.Parcels;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieDetailTabTwo extends Fragment {

    private MovieTrailerResult MTR;
    private RecyclerView TrailerList_RecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v("NOTEME Two","onCreateView");

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_detail_tab_two, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.v("NOTEME Two", "onActivityCreated");

        TrailerList_RecyclerView = (RecyclerView) getView().findViewById(R.id.trailer_recyclerView);
        TrailerList_RecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        TrailerList_RecyclerView.setLayoutManager(linearLayoutManager);

        PopularMovies movie;
        String mid;
        Intent intent  = getActivity().getIntent();
        if(intent.getBundleExtra("movieObj") == null){
            DataUtility dataUtility = new DataUtility();
            if(dataUtility.getSelectedMovie() != null){
                movie = dataUtility.getSelectedMovie();
                mid = movie.getId();
                APICallForMovieTrailer(mid);

                if(savedInstanceState != null){
                    MTR = Parcels.unwrap(savedInstanceState.getParcelable("MovieTrailerList"));
                    if(MTR != null){
                        TrailerAdapter ta = new TrailerAdapter(MTR.getMovieTrailerList(), getContext());
                        TrailerList_RecyclerView.setAdapter(ta);
                    }else {
                        APICallForMovieTrailer(mid);
                    }
                }
            }
        }else {
            movie = Parcels.unwrap(intent.getBundleExtra("movieObj").getParcelable("movie"));
            mid = movie.getId();
            APICallForMovieTrailer(mid);

            if(savedInstanceState != null){
                MTR = Parcels.unwrap(savedInstanceState.getParcelable("MovieTrailerList"));
                if(MTR != null){
                    TrailerAdapter ta = new TrailerAdapter(MTR.getMovieTrailerList(), getContext());
                    TrailerList_RecyclerView.setAdapter(ta);
                }else {
                    APICallForMovieTrailer(mid);
                }
            }
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        try {
            outState.putParcelable("MovieTrailerList", Parcels.wrap(MTR));
        }catch (NullPointerException e){
            outState.putParcelable("MovieTrailerList", null);
        }
        super.onSaveInstanceState(outState);
    }

    private void APICallForMovieTrailer(String mid){
        MovieApiInterface service = ApiClient.getApiClient();
        Call<MovieTrailerResult> call = service.getMoiveTrailers(mid);

        call.enqueue(new Callback<MovieTrailerResult>() {
            @Override
            public void onResponse(Call<MovieTrailerResult> call, Response<MovieTrailerResult> response) {
                MTR = response.body();
                List<MovieTrailer> MT = MTR.getMovieTrailerList();
                TrailerAdapter ta = new TrailerAdapter(MT,getContext());
                TrailerList_RecyclerView.setAdapter(ta);
            }

            @Override
            public void onFailure(Call<MovieTrailerResult> call, Throwable t) {

            }
        });

    }
}
