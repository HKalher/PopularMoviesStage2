package com.kalher.henu.popularmovies.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer;
import com.kalher.henu.popularmovies.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Henu on 07/06/16.
 */
public class TrailerAdapter extends RecyclerView.Adapter<TrailerAdapter.TrailerViewHolder> {

    private List<MovieTrailer> TrailerList;
    private Context mContext;

    public TrailerAdapter(){

    }

    public TrailerAdapter(List<MovieTrailer> TrailerList, Context mContext){
        this.TrailerList = TrailerList;
        this.mContext = mContext;
    }

    @Override
    public TrailerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View trailerItemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.trailer_card_frame, parent, false);
        return new TrailerViewHolder(trailerItemView);
    }

    @Override
    public int getItemCount() {
        return (TrailerList == null ? 0 : TrailerList.size());
    }

    @Override
    public void onBindViewHolder(TrailerViewHolder holder, int position) {
        Picasso.with(mContext).load(TrailerList.get(position).getTrailerThumbnailPath()).into(holder.trailerImageView);
        holder.trailerName.setText(TrailerList.get(position).getTrailerName());
    }

    public class TrailerViewHolder extends RecyclerView.ViewHolder{

        protected ImageView trailerImageView;
        protected TextView trailerName;
        public TrailerViewHolder(final View itemView){
            super(itemView);
            trailerImageView = (ImageView) itemView.findViewById(R.id.trailer_thumbnail);
            trailerName = (TextView) itemView.findViewById(R.id.trailer_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=" + TrailerList.get(getAdapterPosition()).getTrailerKey()));
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
