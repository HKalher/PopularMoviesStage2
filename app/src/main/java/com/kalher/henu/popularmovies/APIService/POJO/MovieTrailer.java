package com.kalher.henu.popularmovies.APIService.POJO;


import org.parceler.Parcel;

/**
 * Created by Henu on 07/06/16.
 */
@Parcel
public class MovieTrailer {

    private String id;
    private String key;
    private String name;

    public MovieTrailer(){
    }

    public String getTrailerId(){
        return id;
    }
    public String getTrailerKey(){
        return key;
    }
    public String getTrailerName(){
        return name;
    }
    public String getTrailerThumbnailPath(){
        return "http://img.youtube.com/vi/" + key+ "/0.jpg";
    }
}
