
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
public class PopularMovies$$Parcelable
    implements Parcelable, ParcelWrapper<com.kalher.henu.popularmovies.APIService.POJO.PopularMovies>
{

    private com.kalher.henu.popularmovies.APIService.POJO.PopularMovies popularMovies$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static PopularMovies$$Parcelable.Creator$$8 CREATOR = new PopularMovies$$Parcelable.Creator$$8();

    public PopularMovies$$Parcelable(android.os.Parcel parcel$$0) {
        com.kalher.henu.popularmovies.APIService.POJO.PopularMovies popularMovies$$2;
        if (parcel$$0 .readInt() == -1) {
            popularMovies$$2 = null;
        } else {
            popularMovies$$2 = readcom_kalher_henu_popularmovies_APIService_POJO_PopularMovies(parcel$$0);
        }
        popularMovies$$0 = popularMovies$$2;
    }

    public PopularMovies$$Parcelable(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies popularMovies$$4) {
        popularMovies$$0 = popularMovies$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (popularMovies$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_kalher_henu_popularmovies_APIService_POJO_PopularMovies(popularMovies$$0, parcel$$1, flags);
        }
    }

    private com.kalher.henu.popularmovies.APIService.POJO.PopularMovies readcom_kalher_henu_popularmovies_APIService_POJO_PopularMovies(android.os.Parcel parcel$$2) {
        com.kalher.henu.popularmovies.APIService.POJO.PopularMovies popularMovies$$1;
        popularMovies$$1 = new com.kalher.henu.popularmovies.APIService.POJO.PopularMovies();
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$1, "overview", parcel$$2 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$1, "backdrop_Path", parcel$$2 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$1, "release_date", parcel$$2 .readString());
        int int$$0 = parcel$$2 .readInt();
        java.util.ArrayList<com.kalher.henu.popularmovies.APIService.POJO.Genres> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new java.util.ArrayList<com.kalher.henu.popularmovies.APIService.POJO.Genres>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$1;
                if (parcel$$2 .readInt() == -1) {
                    genres$$1 = null;
                } else {
                    genres$$1 = readcom_kalher_henu_popularmovies_APIService_POJO_Genres(parcel$$2);
                }
                list$$0 .add(genres$$1);
            }
        }
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$1, "genres", list$$0);
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$1, "vote_average", parcel$$2 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$1, "id", parcel$$2 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$1, "title", parcel$$2 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$1, "vote_count", parcel$$2 .readString());
        int int$$2 = parcel$$2 .readInt();
        java.util.ArrayList<java.lang.String> list$$1;
        if (int$$2 < 0) {
            list$$1 = null;
        } else {
            list$$1 = new java.util.ArrayList<java.lang.String>();
            for (int int$$3 = 0; (int$$3 <int$$2); int$$3 ++) {
                list$$1 .add(parcel$$2 .readString());
            }
        }
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$1, "genre_ids", list$$1);
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$1, "poster_path", parcel$$2 .readString());
        return popularMovies$$1;
    }

    private com.kalher.henu.popularmovies.APIService.POJO.Genres readcom_kalher_henu_popularmovies_APIService_POJO_Genres(android.os.Parcel parcel$$3) {
        com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$0;
        genres$$0 = new com.kalher.henu.popularmovies.APIService.POJO.Genres();
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$0, "name", parcel$$3 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$0, "id", parcel$$3 .readString());
        return genres$$0;
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_PopularMovies(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies popularMovies$$3, android.os.Parcel parcel$$4, int flags$$0) {
        parcel$$4 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "overview"));
        parcel$$4 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "backdrop_Path"));
        parcel$$4 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "release_date"));
        if (InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genres") == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genres").size());
            for (com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$2 : ((java.util.ArrayList<com.kalher.henu.popularmovies.APIService.POJO.Genres> ) InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genres"))) {
                if (genres$$2 == null) {
                    parcel$$4 .writeInt(-1);
                } else {
                    parcel$$4 .writeInt(1);
                    writecom_kalher_henu_popularmovies_APIService_POJO_Genres(genres$$2, parcel$$4, flags$$0);
                }
            }
        }
        parcel$$4 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "vote_average"));
        parcel$$4 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "id"));
        parcel$$4 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "title"));
        parcel$$4 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "vote_count"));
        if (InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genre_ids") == null) {
            parcel$$4 .writeInt(-1);
        } else {
            parcel$$4 .writeInt(InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genre_ids").size());
            for (java.lang.String string$$0 : ((java.util.ArrayList<java.lang.String> ) InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genre_ids"))) {
                parcel$$4 .writeString(string$$0);
            }
        }
        parcel$$4 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "poster_path"));
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_Genres(com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$3, android.os.Parcel parcel$$5, int flags$$1) {
        parcel$$5 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$3, "name"));
        parcel$$5 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$3, "id"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.kalher.henu.popularmovies.APIService.POJO.PopularMovies getParcel() {
        return popularMovies$$0;
    }

    public final static class Creator$$8
        implements Creator<PopularMovies$$Parcelable>
    {


        @Override
        public PopularMovies$$Parcelable createFromParcel(android.os.Parcel parcel$$6) {
            return new PopularMovies$$Parcelable(parcel$$6);
        }

        @Override
        public PopularMovies$$Parcelable[] newArray(int size) {
            return new PopularMovies$$Parcelable[size] ;
        }

    }

}
