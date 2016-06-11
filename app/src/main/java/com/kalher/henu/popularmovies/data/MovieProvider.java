package com.kalher.henu.popularmovies.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Henu on 03/06/16.
 */
public class MovieProvider extends ContentProvider {

    private static final UriMatcher sUriMatcher = buildUriMatcher();
    private MovieDbHelper mOpenHelper;

    private static final int ALL_FavMovie = 100;
    private static final int MoveiWithID = 101;

    private static final SQLiteQueryBuilder sMovieQueryBuilder;

    static {
        sMovieQueryBuilder = new SQLiteQueryBuilder();
        sMovieQueryBuilder.setTables(MovieContract.FavMovieEntry.TABLE_NAME);
    }

    // fav_movie.movie==?
    private static final String sSpecifiedMovie = MovieContract.FavMovieEntry.TABLE_NAME + "." + MovieContract.FavMovieEntry.COLUMN_MOVIE_ID + " = ? ";



    private static UriMatcher buildUriMatcher(){
        final UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
        final String authority = MovieContract.CONTENT_AUTHORITY;

        // for table fav_movie
        matcher.addURI(authority, MovieContract.PATH_FAV_MOVIE, ALL_FavMovie); // returns match=ALL_FavMovie if matched
        matcher.addURI(authority, MovieContract.PATH_FAV_MOVIE + "/#", MoveiWithID); // returns match=MovieWithID if matched

        return matcher;
    }

    @Override
    public boolean onCreate() {
        mOpenHelper = new MovieDbHelper(getContext());
        return true;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        final int match = sUriMatcher.match(uri);

        switch (match) {
            case ALL_FavMovie:
                return MovieContract.FavMovieEntry.CONTENT_TYPE;
            case MoveiWithID:
                return MovieContract.FavMovieEntry.CONTENT_ITEM_TYPE;
            default:
                throw new UnsupportedOperationException("Unknown uri: " + uri);
        }
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        Cursor retCursor;
        switch (sUriMatcher.match(uri)){
            case ALL_FavMovie:
            {
                retCursor = getAllFavMovies();
                break;
            }
            case MoveiWithID:
            {
                selection = sSpecifiedMovie;    // assign the prewritten sqlite command
                selectionArgs = new String[]{MovieContract.FavMovieEntry.getMovieIdFromUri(uri)};   // fetch MovieId from the Uri
                retCursor = getSpecifiedMovie(selection, selectionArgs);
                break;
            }
            default:
                throw new UnsupportedOperationException("Unknown uri: " + uri);
        }
        retCursor.setNotificationUri(getContext().getContentResolver(), uri);
        return retCursor;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        final SQLiteDatabase db = mOpenHelper.getWritableDatabase();
        final int match = sUriMatcher.match(uri);
        Uri returnUri;

        switch (match){
            case ALL_FavMovie: {
                long _id = db.insert(MovieContract.FavMovieEntry.TABLE_NAME, null, values); // performs the insert function in the database
                if (_id > 0)
                    returnUri = MovieContract.FavMovieEntry.buildMovieUri(_id); // buildMovieUri is a function in MovieContract which returns the complete uri by appending the _id to the Base uri
                else
                    throw new android.database.SQLException("Failed to insert row into " + uri);
                break;
            }
            default:
                throw new UnsupportedOperationException("Unknown uri: " + uri);
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return returnUri;   // we need to return the Uri of all newly inserted items so that all the concerning UI can be updated
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        final SQLiteDatabase db = mOpenHelper.getWritableDatabase();
        final int match = sUriMatcher.match(uri);
        int rowsDeleted;
        if(null == selection) {
            selection = "1";
        }else {
            selection = sSpecifiedMovie;
        }
        switch (match){
            case ALL_FavMovie:
                rowsDeleted = db.delete(MovieContract.FavMovieEntry.TABLE_NAME, selection, selectionArgs);
                break;
            default:
                throw new UnsupportedOperationException("Unknown uri: " + uri);
        }
        if(rowsDeleted != 0){
            getContext().getContentResolver().notifyChange(uri, null);
        }
        return rowsDeleted;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }




    private Cursor getAllFavMovies(){
        return sMovieQueryBuilder.query(mOpenHelper.getReadableDatabase(),
                null,   // projection
                null,   // selection
                null,   // selectionArgs
                null,   // groupBy
                null,   // having
                null   // sortOrder
        );
    }

    private Cursor getSpecifiedMovie(String selection, String[] selctionArgs){
        return sMovieQueryBuilder.query(mOpenHelper.getReadableDatabase(),
                null,
                selection,
                selctionArgs,
                null,
                null,
                null
        );
    }

}
