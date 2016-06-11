package com.kalher.henu.popularmovies.MovieDetail;

import java.util.HashMap;

/**
 * Created by Henu on 07/06/16.
 */
public class MovieData {
    private HashMap<String,String> genreMap;

    private void genrateGenreList(){

        genreMap = new HashMap<String,String>();
        genreMap.put("28","Action");
        genreMap.put("12","Adventure");
        genreMap.put("16","Animation");
        genreMap.put("35","Comedy");
        genreMap.put("80","Crime");
        genreMap.put("99","Documentary");
        genreMap.put("18","Drama");
        genreMap.put("10751","Family");
        genreMap.put("14","Fantasy");
        genreMap.put("10769","Foreign");
        genreMap.put("36","History");
        genreMap.put("27","Horror");
        genreMap.put("10402","Music");
        genreMap.put("9648","Mystery");
        genreMap.put("10749","Romance");
        genreMap.put("878","Science Fiction");
        genreMap.put("10770","TV Movie");
        genreMap.put("53","Thriller");
        genreMap.put("10752","War");
        genreMap.put("37","Western");
    }

    public HashMap<String, String> getGenreMap(){
        genrateGenreList();
        return genreMap;
    }
}
