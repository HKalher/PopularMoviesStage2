package com.kalher.henu.popularmovies.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.kalher.henu.popularmovies.data.MovieContract.FavMovieEntry;

/**
 * Created by Henu on 03/06/16.
 */
public class MovieDbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "movietime.db";

    public MovieDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_FAVMOVIE_TABLE = "CREATE TABLE " + FavMovieEntry.TABLE_NAME + " (" +
                FavMovieEntry.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                FavMovieEntry.COLUMN_TITLE + " TEXT NOT NULL, " +
                FavMovieEntry.COLUMN_POSTER_PATH + " TEXT NOT NULL, " +
                FavMovieEntry.COLUMN_OVERVIEW + " TEXT NOT NULL, " +
                FavMovieEntry.COLUMN_BACKDROP_PATH + " TEXT NOT NULL, " +
                FavMovieEntry.COLUMN_MOVIE_ID + " TEXT NOT NULL, " +
                FavMovieEntry.COLUMN_VOTE_COUNT + " TEXT NOT NULL, " +
                FavMovieEntry.COLUMN_VOTE_AVERAGE + " TEXT NOT NULL, " +
                FavMovieEntry.COLUMN_REALEASE_DATE + " TEXT NOT NULL, " +
                FavMovieEntry.COLUMN_GENRE_ID + " TEXT NOT NULL " +
                " );";
        db.execSQL(SQL_CREATE_FAVMOVIE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + FavMovieEntry.TABLE_NAME);
        onCreate(db);
    }
}
