package com.kalher.henu.popularmovies.APIService.POJO;

import org.parceler.Parcel;

import java.util.ArrayList;

/**
 * Created by Henu on 11/06/16.
 */
@Parcel
public class Genres {
    private String id;
    private String name;

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
