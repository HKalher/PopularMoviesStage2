
package com.kalher.henu.popularmovies.APIService.POJO;

import java.util.ArrayList;
import java.util.List;
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
public class MovieImagesResult$$Parcelable
    implements Parcelable, ParcelWrapper<com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult>
{

    private com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult movieImagesResult$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static MovieImagesResult$$Parcelable.Creator$$2 CREATOR = new MovieImagesResult$$Parcelable.Creator$$2();

    public MovieImagesResult$$Parcelable(android.os.Parcel parcel$$0) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult movieImagesResult$$2;
        if (parcel$$0 .readInt() == -1) {
            movieImagesResult$$2 = null;
        } else {
            movieImagesResult$$2 = readcom_kalher_henu_popularmovies_APIService_POJO_MovieImagesResult(parcel$$0);
        }
        movieImagesResult$$0 = movieImagesResult$$2;
    }

    public MovieImagesResult$$Parcelable(com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult movieImagesResult$$4) {
        movieImagesResult$$0 = movieImagesResult$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (movieImagesResult$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_kalher_henu_popularmovies_APIService_POJO_MovieImagesResult(movieImagesResult$$0, parcel$$1, flags);
        }
    }

    private com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult readcom_kalher_henu_popularmovies_APIService_POJO_MovieImagesResult(android.os.Parcel parcel$$2) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult movieImagesResult$$1;
        movieImagesResult$$1 = new com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult();
        int int$$0 = parcel$$2 .readInt();
        ArrayList<com.kalher.henu.popularmovies.APIService.POJO.MovieImages> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<com.kalher.henu.popularmovies.APIService.POJO.MovieImages>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                com.kalher.henu.popularmovies.APIService.POJO.MovieImages movieImages$$1;
                if (parcel$$2 .readInt() == -1) {
                    movieImages$$1 = null;
                } else {
                    movieImages$$1 = readcom_kalher_henu_popularmovies_APIService_POJO_MovieImages(parcel$$2);
                }
                list$$0 .add(movieImages$$1);
            }
        }
        movieImagesResult$$1 .ImagesResult = list$$0;
        return movieImagesResult$$1;
    }

    private com.kalher.henu.popularmovies.APIService.POJO.MovieImages readcom_kalher_henu_popularmovies_APIService_POJO_MovieImages(android.os.Parcel parcel$$3) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieImages movieImages$$0;
        movieImages$$0 = new com.kalher.henu.popularmovies.APIService.POJO.MovieImages();
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieImages.class, movieImages$$0, "file_path", parcel$$3 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieImages.class, movieImages$$0, "Base_Image_Path", parcel$$3 .readString());
        return movieImages$$0;
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_MovieImagesResult(com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult movieImagesResult$$3, android.os.Parcel parcel$$4, int flags$$0) {
        if (movieImagesResult$$3 .ImagesResult == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(movieImagesResult$$3 .ImagesResult.size());
            for (com.kalher.henu.popularmovies.APIService.POJO.MovieImages movieImages$$2 : ((List<com.kalher.henu.popularmovies.APIService.POJO.MovieImages> ) movieImagesResult$$3 .ImagesResult)) {
                if (movieImages$$2 == null) {
                    parcel$$4 .writeInt(-1);
                } else {
                    parcel$$4 .writeInt(1);
                    writecom_kalher_henu_popularmovies_APIService_POJO_MovieImages(movieImages$$2, parcel$$4, flags$$0);
                }
            }
        }
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_MovieImages(com.kalher.henu.popularmovies.APIService.POJO.MovieImages movieImages$$3, android.os.Parcel parcel$$5, int flags$$1) {
        parcel$$5 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieImages.class, movieImages$$3, "file_path"));
        parcel$$5 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieImages.class, movieImages$$3, "Base_Image_Path"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult getParcel() {
        return movieImagesResult$$0;
    }

    public final static class Creator$$2
        implements Creator<MovieImagesResult$$Parcelable>
    {


        @Override
        public MovieImagesResult$$Parcelable createFromParcel(android.os.Parcel parcel$$6) {
            return new MovieImagesResult$$Parcelable(parcel$$6);
        }

        @Override
        public MovieImagesResult$$Parcelable[] newArray(int size) {
            return new MovieImagesResult$$Parcelable[size] ;
        }

    }

}
