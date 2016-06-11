package com.kalher.henu.popularmovies.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kalher.henu.popularmovies.APIService.POJO.MovieReviews;
import com.kalher.henu.popularmovies.R;

import java.util.List;

/**
 * Created by Henu on 07/06/16.
 */
public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder> {

    private List<MovieReviews> MovieReviewList;
    private Context mContext;

    public ReviewAdapter(List<MovieReviews> MovieReviewList, Context mContext){
        this.MovieReviewList = MovieReviewList;
        this.mContext = mContext;
    }

    @Override
    public ReviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View reviewView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.review_frame, parent, false);  // if of the frame designed for a single element of recyclerView
        return new ReviewViewHolder(reviewView);
    }

    @Override
    public int getItemCount() {

        return MovieReviewList == null ? 0 : MovieReviewList.size();
    }

    @Override
    public void onBindViewHolder(ReviewViewHolder holder, int position) {

        holder.reviewAuthor.setText(MovieReviewList.get(position).getAuthor());
        holder.reviewContent.setText(MovieReviewList.get(position).getContent());
    }

    public class ReviewViewHolder extends RecyclerView.ViewHolder{
        protected TextView reviewAuthor;
        protected TextView reviewContent;
        public ReviewViewHolder(View itemView){
            super(itemView);
            reviewAuthor = (TextView) itemView.findViewById(R.id.review_author);
            reviewContent = (TextView) itemView.findViewById(R.id.review_content);
        }
    }
}
