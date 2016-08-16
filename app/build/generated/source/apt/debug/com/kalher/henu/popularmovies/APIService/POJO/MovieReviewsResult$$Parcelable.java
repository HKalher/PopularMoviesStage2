
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
public class MovieReviewsResult$$Parcelable
    implements Parcelable, ParcelWrapper<com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult>
{

    private com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult movieReviewsResult$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static MovieReviewsResult$$Parcelable.Creator$$4 CREATOR = new MovieReviewsResult$$Parcelable.Creator$$4();

    public MovieReviewsResult$$Parcelable(android.os.Parcel parcel$$0) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult movieReviewsResult$$2;
        if (parcel$$0 .readInt() == -1) {
            movieReviewsResult$$2 = null;
        } else {
            movieReviewsResult$$2 = readcom_kalher_henu_popularmovies_APIService_POJO_MovieReviewsResult(parcel$$0);
        }
        movieReviewsResult$$0 = movieReviewsResult$$2;
    }

    public MovieReviewsResult$$Parcelable(com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult movieReviewsResult$$4) {
        movieReviewsResult$$0 = movieReviewsResult$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (movieReviewsResult$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_kalher_henu_popularmovies_APIService_POJO_MovieReviewsResult(movieReviewsResult$$0, parcel$$1, flags);
        }
    }

    private com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult readcom_kalher_henu_popularmovies_APIService_POJO_MovieReviewsResult(android.os.Parcel parcel$$2) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult movieReviewsResult$$1;
        movieReviewsResult$$1 = new com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult();
        int int$$0 = parcel$$2 .readInt();
        ArrayList<com.kalher.henu.popularmovies.APIService.POJO.MovieReviews> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new ArrayList<com.kalher.henu.popularmovies.APIService.POJO.MovieReviews>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                com.kalher.henu.popularmovies.APIService.POJO.MovieReviews movieReviews$$1;
                if (parcel$$2 .readInt() == -1) {
                    movieReviews$$1 = null;
                } else {
                    movieReviews$$1 = readcom_kalher_henu_popularmovies_APIService_POJO_MovieReviews(parcel$$2);
                }
                list$$0 .add(movieReviews$$1);
            }
        }
        movieReviewsResult$$1 .ReviewsResult = list$$0;
        return movieReviewsResult$$1;
    }

    private com.kalher.henu.popularmovies.APIService.POJO.MovieReviews readcom_kalher_henu_popularmovies_APIService_POJO_MovieReviews(android.os.Parcel parcel$$3) {
        com.kalher.henu.popularmovies.APIService.POJO.MovieReviews movieReviews$$0;
        movieReviews$$0 = new com.kalher.henu.popularmovies.APIService.POJO.MovieReviews();
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$0, "author", parcel$$3 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$0, "id", parcel$$3 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$0, "content", parcel$$3 .readString());
        return movieReviews$$0;
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_MovieReviewsResult(com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult movieReviewsResult$$3, android.os.Parcel parcel$$4, int flags$$0) {
        if (movieReviewsResult$$3 .ReviewsResult == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(movieReviewsResult$$3 .ReviewsResult.size());
            for (com.kalher.henu.popularmovies.APIService.POJO.MovieReviews movieReviews$$2 : ((List<com.kalher.henu.popularmovies.APIService.POJO.MovieReviews> ) movieReviewsResult$$3 .ReviewsResult)) {
                if (movieReviews$$2 == null) {
                    parcel$$4 .writeInt(-1);
                } else {
                    parcel$$4 .writeInt(1);
                    writecom_kalher_henu_popularmovies_APIService_POJO_MovieReviews(movieReviews$$2, parcel$$4, flags$$0);
                }
            }
        }
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_MovieReviews(com.kalher.henu.popularmovies.APIService.POJO.MovieReviews movieReviews$$3, android.os.Parcel parcel$$5, int flags$$1) {
        parcel$$5 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$3, "author"));
        parcel$$5 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$3, "id"));
        parcel$$5 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.MovieReviews.class, movieReviews$$3, "content"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult getParcel() {
        return movieReviewsResult$$0;
    }

    public final static class Creator$$4
        implements Creator<MovieReviewsResult$$Parcelable>
    {


        @Override
        public MovieReviewsResult$$Parcelable createFromParcel(android.os.Parcel parcel$$6) {
            return new MovieReviewsResult$$Parcelable(parcel$$6);
        }

        @Override
        public MovieReviewsResult$$Parcelable[] newArray(int size) {
            return new MovieReviewsResult$$Parcelable[size] ;
        }

    }

}
