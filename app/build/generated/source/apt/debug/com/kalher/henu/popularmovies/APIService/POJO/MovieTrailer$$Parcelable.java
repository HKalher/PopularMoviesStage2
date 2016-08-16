
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
public class MovieTrailer$$Parcelable
    implements Parcelable, ParcelWrapper<com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer>
{

    private com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer movieTrailer$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static MovieTrailer$$Parcelable.Creator$$5 CREATOR = new MovieTrailer$$Parcelable.Creator$$5();

    public MovieTrailer$$Parcelable(android.os.Parcel parcel$$0) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer movieTrailer$$2;
        if (parcel$$0 .readInt() == -1) {
            movieTrailer$$2 = null;
        } else {
            movieTrailer$$2 = readcom_kalher_henu_popularmovies_APIService_POJO_MovieTrailer(parcel$$0);
        }
        movieTrailer$$0 = movieTrailer$$2;
    }

    public MovieTrailer$$Parcelable(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer movieTrailer$$4) {
        movieTrailer$$0 = movieTrailer$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (movieTrailer$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_kalher_henu_popularmovies_APIService_POJO_MovieTrailer(movieTrailer$$0, parcel$$1, flags);
        }
    }

    private com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer readcom_kalher_henu_popularmovies_APIService_POJO_MovieTrailer(android.os.Parcel parcel$$2) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer movieTrailer$$1;
        movieTrailer$$1 = new com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer();
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$1, "name", parcel$$2 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$1, "id", parcel$$2 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$1, "key", parcel$$2 .readString());
        return movieTrailer$$1;
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_MovieTrailer(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer movieTrailer$$3, android.os.Parcel parcel$$3, int flags$$0) {
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$3, "name"));
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$3, "id"));
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$3, "key"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer getParcel() {
        return movieTrailer$$0;
    }

    public final static class Creator$$5
        implements Creator<MovieTrailer$$Parcelable>
    {


        @Override
        public MovieTrailer$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new MovieTrailer$$Parcelable(parcel$$4);
        }

        @Override
        public MovieTrailer$$Parcelable[] newArray(int size) {
            return new MovieTrailer$$Parcelable[size] ;
        }

    }

}
