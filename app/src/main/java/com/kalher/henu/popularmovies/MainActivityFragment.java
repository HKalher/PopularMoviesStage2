package com.kalher.henu.popularmovies;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import com.kalher.henu.popularmovies.APIService.ApiClient;
import com.kalher.henu.popularmovies.APIService.MovieApiInterface;
import com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult;
import com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult;
import com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult;
import com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult;
import com.kalher.henu.popularmovies.APIService.POJO.PopularMovies;
import com.kalher.henu.popularmovies.Adapters.MyAdapter;
import com.kalher.henu.popularmovies.data.MovieContract;

import org.parceler.Parcels;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Path;

public class MainActivityFragment extends Fragment {

    private RecyclerView recyclerView;
    private PopularMovieResult result;
    private Toast toast;
    private boolean twoPane;
    private Activity activity;

    public MainActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRetainInstance(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if(getActivity().findViewById(R.id.movie_detail_container) != null){
            twoPane = true;

        }else {
            twoPane = false;
        }

        activity = getActivity();

        toast = Toast.makeText(getContext(),"Fetching data from server",Toast.LENGTH_SHORT);
        recyclerView = (RecyclerView) getView().findViewById(R.id.cardGrid);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),getColumns());
        gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);


        if(savedInstanceState != null){
            PopularMovieResult movieResult = Parcels.unwrap(savedInstanceState.getParcelable("parced_movieList"));
            if(movieResult != null){
                MyAdapter adapter = new MyAdapter(movieResult.getMovieList(), getContext(), twoPane, activity);
                recyclerView.setAdapter(adapter);
            }else {
                APICall("popular_movies");
            }
        }else {
            APICall("popular_movies");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        try{
            outState.putParcelable("parced_movieList",Parcels.wrap(new PopularMovieResult(result.getMovieList())));
        }catch (NullPointerException e){
            outState.putParcelable("parced_movieList",Parcels.wrap(new PopularMovieResult(null)));
        }
        super.onSaveInstanceState(outState);
    }

    public void APICall(String load){
        toast.show();
        MovieApiInterface service = ApiClient.getApiClient();
        Call<PopularMovieResult> call;
        switch (load){
            case ("popular_movies"):
                call = service.getPopularMovieResult();
                break;
            case ("highest_rated"):
                call = service.getHighestRatedMovieResult();
                break;
            default:
                call = service.getPopularMovieResult();
        }

        call.enqueue(new Callback<PopularMovieResult>() {
            @Override
            public void onResponse(Call<PopularMovieResult> call, Response<PopularMovieResult> response) {
                result = response.body();
                MyAdapter adapter = new MyAdapter(result.getMovieList(), getContext(), twoPane, activity);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<PopularMovieResult> call, Throwable t) {

            }
        });
    }

    public int getColumns(){
        WindowManager windowManager = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int width;
        if(getActivity().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            width = metrics.heightPixels;
        }else {
            width = metrics.widthPixels;
        }

        if(width>=960){
            if(getActivity().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
                return 3;
            }else {
                return 2;
            }
        }else {
            if(getActivity().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
                return 3;
            }else {
                return 2;
            }
        }

    }

    public void InflateFavouriteMoviesList(){
        final Cursor cursor = getContext().getContentResolver().query(MovieContract.FavMovieEntry.CONTENT_URI, null, null, null, null);

        final List<PopularMovies> favMovieList = new ArrayList<PopularMovies>();
        cursor.moveToFirst();
        if(cursor.getCount()>0){
            do{
                MovieApiInterface service = ApiClient.getApiClient();
                Call<PopularMovies> call = service.getMovieDetail(cursor.getString(cursor.getColumnIndex(MovieContract.FavMovieEntry.COLUMN_MOVIE_ID)));
                call.enqueue(new Callback<PopularMovies>() {
                    @Override
                    public void onResponse(Call<PopularMovies> call, Response<PopularMovies> response) {
                        favMovieList.add(response.body());

                        MyAdapter adapter = new MyAdapter(favMovieList, getContext(), twoPane, activity);
                        recyclerView.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(Call<PopularMovies> call, Throwable t) {

                    }
                });
            }while (cursor.moveToNext());
            cursor.close();
        }else {
            Toast.makeText(getContext(),"No Movie in Favourite List",Toast.LENGTH_LONG).show();
        }
    }

}
