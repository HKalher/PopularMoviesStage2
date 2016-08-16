
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
public class MovieImages$$Parcelable
    implements Parcelable, ParcelWrapper<com.kalher.henu.popularmovies.APIService.POJO.MovieImages>
{

    private com.kalher.henu.popularmovies.APIService.POJO.MovieImages movieImages$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static MovieImages$$Parcelable.Creator$$1 CREATOR = new MovieImages$$Parcelable.Creator$$1();

    public MovieImages$$Parcelable(android.os.Parcel parcel$$0) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieImages movieImages$$2;
        if (parcel$$0 .readInt() == -1) {
            movieImages$$2 = null;
        } else {
            movieImages$$2 = readcom_kalher_henu_popularmovies_APIService_POJO_MovieImages(parcel$$0);
        }
        movieImages$$0 = movieImages$$2;
    }

    public MovieImages$$Parcelable(com.kalher.henu.popularmovies.APIService.POJO.MovieImages movieImages$$4) {
        movieImages$$0 = movieImages$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (movieImages$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_kalher_henu_popularmovies_APIService_POJO_MovieImages(movieImages$$0, parcel$$1, flags);
        }
    }

    private com.kalher.henu.popularmovies.APIService.POJO.MovieImages readcom_kalher_henu_popularmovies_APIService_POJO_MovieImages(android.os.Parcel parcel$$2) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieImages movieImages$$1;
        movieImages$$1 = new com.kalher.henu.popularmovies.APIService.POJO.MovieImages();
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieImages.class, movieImages$$1, "file_path", parcel$$2 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieImages.class, movieImages$$1, "Base_Image_Path", parcel$$2 .readString());
        return movieImages$$1;
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_MovieImages(com.kalher.henu.popularmovies.APIService.POJO.MovieImages movieImages$$3, android.os.Parcel parcel$$3, int flags$$0) {
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieImages.class, movieImages$$3, "file_path"));
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieImages.class, movieImages$$3, "Base_Image_Path"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.kalher.henu.popularmovies.APIService.POJO.MovieImages getParcel() {
        return movieImages$$0;
    }

    public final static class Creator$$1
        implements Creator<MovieImages$$Parcelable>
    {


        @Override
        public MovieImages$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new MovieImages$$Parcelable(parcel$$4);
        }

        @Override
        public MovieImages$$Parcelable[] newArray(int size) {
            return new MovieImages$$Parcelable[size] ;
        }

    }

}
