package com.kalher.henu.popularmovies.data;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;
import android.provider.ContactsContract;
import android.util.Log;

/**
 * Created by Henu on 03/06/16.
 */
public class MovieContract {

    public static final String CONTENT_AUTHORITY = "com.kalher.henu.popularmovies";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_FAV_MOVIE = "fav_movie";

    public static final class FavMovieEntry implements BaseColumns {

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_FAV_MOVIE).build();

        public static final String CONTENT_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_FAV_MOVIE;    // used in getType()
        public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_FAV_MOVIE; // used in getType()

        public static Uri buildMovieUri(long id){   // used to build uri when new items are inserted into the database
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

        /**
         * Defining the table name and it's columns for location table
         */
        public static final String TABLE_NAME = "fav_movie";

        public static final String COLUMN_ID = "id";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_POSTER_PATH = "poster_path";
        public static final String COLUMN_OVERVIEW = "overview";
        public static final String COLUMN_BACKDROP_PATH = "backdrop_path";
        public static final String COLUMN_MOVIE_ID = "movie_id";
        public static final String COLUMN_VOTE_COUNT = "vote_count";
        public static final String COLUMN_VOTE_AVERAGE = "vote_average";
        public static final String COLUMN_REALEASE_DATE = "release_date";
        public static final String COLUMN_GENRE_ID = "genre_ids";

        public static String getMovieIdFromUri(Uri uri){
            return uri.getPathSegments().get(1);
        }
    }
}
