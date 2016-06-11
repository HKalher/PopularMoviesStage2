package com.kalher.henu.popularmovies.APIService.POJO;

import org.parceler.Parcel;

/**
 * Created by Henu on 07/06/16.
 */
@Parcel
public class MovieReviews {
    private String id;
    private String author;
    private String content;

    public MovieReviews(){
    }

    public String getId(){
        return id;
    }
    public String getAuthor(){
        return author;
    }
    public String getContent(){
        return content;
    }
}
