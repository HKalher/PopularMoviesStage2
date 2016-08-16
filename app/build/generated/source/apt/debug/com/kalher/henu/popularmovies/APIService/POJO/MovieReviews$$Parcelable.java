
package com.kalher.henu.popularmovies.APIService.POJO;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2016-06-20T12:24+0530")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class MovieReviews$$Parcelable
    implements Parcelable, ParcelWrapper<com.kalher.henu.popularmovies.APIService.POJO.MovieReviews>
{

    private com.kalher.henu.popularmovies.APIService.POJO.MovieReviews movieReviews$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static MovieReviews$$Parcelable.Creator$$3 CREATOR = new MovieReviews$$Parcelable.Creator$$3();

    public MovieReviews$$Parcelable(android.os.Parcel parcel$$0) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieReviews movieReviews$$2;
        if (parcel$$0 .readInt() == -1) {
            movieReviews$$2 = null;
        } else {
            movieReviews$$2 = readcom_kalher_henu_popularmovies_APIService_POJO_MovieReviews(parcel$$0);
        }
        movieReviews$$0 = movieReviews$$2;
    }

    public MovieReviews$$Parcelable(com.kalher.henu.popularmovies.APIService.POJO.MovieReviews movieReviews$$4) {
        movieReviews$$0 = movieReviews$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (movieReviews$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_kalher_henu_popularmovies_APIService_POJO_MovieReviews(movieReviews$$0, parcel$$1, flags);
        }
    }

    private com.kalher.henu.popularmovies.APIService.POJO.MovieReviews readcom_kalher_henu_popularmovies_APIService_POJO_MovieReviews(android.os.Parcel parcel$$2) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieReviews movieReviews$$1;
        movieReviews$$1 = new com.kalher.henu.popularmovies.APIService.POJO.MovieReviews();
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$1, "author", parcel$$2 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$1, "id", parcel$$2 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$1, "content", parcel$$2 .readString());
        return movieReviews$$1;
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_MovieReviews(com.kalher.henu.popularmovies.APIService.POJO.MovieReviews movieReviews$$3, android.os.Parcel parcel$$3, int flags$$0) {
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$3, "author"));
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$3, "id"));
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$3, "content"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.kalher.henu.popularmovies.APIService.POJO.MovieReviews getParcel() {
        return movieReviews$$0;
    }

    public final static class Creator$$3
        implements Creator<MovieReviews$$Parcelable>
    {


        @Override
        public MovieReviews$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new MovieReviews$$Parcelable(parcel$$4);
        }

        @Override
        public MovieReviews$$Parcelable[] newArray(int size) {
            return new MovieReviews$$Parcelable[size] ;
        }

    }

}
