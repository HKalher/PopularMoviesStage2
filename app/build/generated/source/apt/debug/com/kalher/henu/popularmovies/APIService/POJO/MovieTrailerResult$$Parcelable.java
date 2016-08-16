
package com.kalher.henu.popularmovies.APIService.POJO;

import java.util.ArrayList;
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
public class MovieTrailerResult$$Parcelable
    implements Parcelable, ParcelWrapper<com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult>
{

    private com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult movieTrailerResult$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static MovieTrailerResult$$Parcelable.Creator$$6 CREATOR = new MovieTrailerResult$$Parcelable.Creator$$6();

    public MovieTrailerResult$$Parcelable(android.os.Parcel parcel$$0) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult movieTrailerResult$$2;
        if (parcel$$0 .readInt() == -1) {
            movieTrailerResult$$2 = null;
        } else {
            movieTrailerResult$$2 = readcom_kalher_henu_popularmovies_APIService_POJO_MovieTrailerResult(parcel$$0);
        }
        movieTrailerResult$$0 = movieTrailerResult$$2;
    }

    public MovieTrailerResult$$Parcelable(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult movieTrailerResult$$4) {
        movieTrailerResult$$0 = movieTrailerResult$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (movieTrailerResult$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_kalher_henu_popularmovies_APIService_POJO_MovieTrailerResult(movieTrailerResult$$0, parcel$$1, flags);
        }
    }

    private com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult readcom_kalher_henu_popularmovies_APIService_POJO_MovieTrailerResult(android.os.Parcel parcel$$2) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult movieTrailerResult$$1;
        movieTrailerResult$$1 = new com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult();
        int int$$0 = parcel$$2 .readInt();
        ArrayList<com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer movieTrailer$$1;
                if (parcel$$2 .readInt() == -1) {
                    movieTrailer$$1 = null;
                } else {
                    movieTrailer$$1 = readcom_kalher_henu_popularmovies_APIService_POJO_MovieTrailer(parcel$$2);
                }
                list$$0 .add(movieTrailer$$1);
            }
        }
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult.class, movieTrailerResult$$1, "MovieTrailerList", list$$0);
        return movieTrailerResult$$1;
    }

    private com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer readcom_kalher_henu_popularmovies_APIService_POJO_MovieTrailer(android.os.Parcel parcel$$3) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer movieTrailer$$0;
        movieTrailer$$0 = new com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer();
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$0, "name", parcel$$3 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$0, "id", parcel$$3 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$0, "key", parcel$$3 .readString());
        return movieTrailer$$0;
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_MovieTrailerResult(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult movieTrailerResult$$3, android.os.Parcel parcel$$4, int flags$$0) {
        if (InjectionUtil.getField(java.util.List.class, com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult.class, movieTrailerResult$$3, "MovieTrailerList") == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(InjectionUtil.getField(java.util.List.class, com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult.class, movieTrailerResult$$3, "MovieTrailerList").size());
            for (com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer movieTrailer$$2 : ((java.util.List<com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer> ) InjectionUtil.getField(java.util.List.class, com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult.class, movieTrailerResult$$3, "MovieTrailerList"))) {
                if (movieTrailer$$2 == null) {
                    parcel$$4 .writeInt(-1);
                } else {
                    parcel$$4 .writeInt(1);
                    writecom_kalher_henu_popularmovies_APIService_POJO_MovieTrailer(movieTrailer$$2, parcel$$4, flags$$0);
                }
            }
        }
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_MovieTrailer(com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer movieTrailer$$3, android.os.Parcel parcel$$5, int flags$$1) {
        parcel$$5 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$3, "name"));
        parcel$$5 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$3, "id"));
        parcel$$5 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer.class, movieTrailer$$3, "key"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult getParcel() {
        return movieTrailerResult$$0;
    }

    public final static class Creator$$6
        implements Creator<MovieTrailerResult$$Parcelable>
    {


        @Override
        public MovieTrailerResult$$Parcelable createFromParcel(android.os.Parcel parcel$$6) {
            return new MovieTrailerResult$$Parcelable(parcel$$6);
        }

        @Override
        public MovieTrailerResult$$Parcelable[] newArray(int size) {
            return new MovieTrailerResult$$Parcelable[size] ;
        }

    }

}
