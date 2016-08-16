
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
public class PopularMovieResult$$Parcelable
    implements Parcelable, ParcelWrapper<com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult>
{

    private com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult popularMovieResult$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static PopularMovieResult$$Parcelable.Creator$$7 CREATOR = new PopularMovieResult$$Parcelable.Creator$$7();

    public PopularMovieResult$$Parcelable(android.os.Parcel parcel$$0) {
        com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult popularMovieResult$$2;
        if (parcel$$0 .readInt() == -1) {
            popularMovieResult$$2 = null;
        } else {
            popularMovieResult$$2 = readcom_kalher_henu_popularmovies_APIService_POJO_PopularMovieResult(parcel$$0);
        }
        popularMovieResult$$0 = popularMovieResult$$2;
    }

    public PopularMovieResult$$Parcelable(com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult popularMovieResult$$4) {
        popularMovieResult$$0 = popularMovieResult$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (popularMovieResult$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_kalher_henu_popularmovies_APIService_POJO_PopularMovieResult(popularMovieResult$$0, parcel$$1, flags);
        }
    }

    private com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult readcom_kalher_henu_popularmovies_APIService_POJO_PopularMovieResult(android.os.Parcel parcel$$2) {
        com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult popularMovieResult$$1;
        popularMovieResult$$1 = new com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult();
        int int$$0 = parcel$$2 .readInt();
        java.util.ArrayList<com.kalher.henu.popularmovies.APIService.POJO.PopularMovies> list$$0;
        if (int$$0 < 0) {
            list$$0 = null;
        } else {
            list$$0 = new java.util.ArrayList<com.kalher.henu.popularmovies.APIService.POJO.PopularMovies>();
            for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                com.kalher.henu.popularmovies.APIService.POJO.PopularMovies popularMovies$$1;
                if (parcel$$2 .readInt() == -1) {
                    popularMovies$$1 = null;
                } else {
                    popularMovies$$1 = readcom_kalher_henu_popularmovies_APIService_POJO_PopularMovies(parcel$$2);
                }
                list$$0 .add(popularMovies$$1);
            }
        }
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult.class, popularMovieResult$$1, "MovieList", list$$0);
        return popularMovieResult$$1;
    }

    private com.kalher.henu.popularmovies.APIService.POJO.PopularMovies readcom_kalher_henu_popularmovies_APIService_POJO_PopularMovies(android.os.Parcel parcel$$3) {
        com.kalher.henu.popularmovies.APIService.POJO.PopularMovies popularMovies$$0;
        popularMovies$$0 = new com.kalher.henu.popularmovies.APIService.POJO.PopularMovies();
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$0, "overview", parcel$$3 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$0, "backdrop_Path", parcel$$3 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$0, "release_date", parcel$$3 .readString());
        int int$$2 = parcel$$3 .readInt();
        java.util.ArrayList<com.kalher.henu.popularmovies.APIService.POJO.Genres> list$$1;
        if (int$$2 < 0) {
            list$$1 = null;
        } else {
            list$$1 = new java.util.ArrayList<com.kalher.henu.popularmovies.APIService.POJO.Genres>();
            for (int int$$3 = 0; (int$$3 <int$$2); int$$3 ++) {
                com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$1;
                if (parcel$$3 .readInt() == -1) {
                    genres$$1 = null;
                } else {
                    genres$$1 = readcom_kalher_henu_popularmovies_APIService_POJO_Genres(parcel$$3);
                }
                list$$1 .add(genres$$1);
            }
        }
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$0, "genres", list$$1);
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$0, "vote_average", parcel$$3 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$0, "id", parcel$$3 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$0, "title", parcel$$3 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$0, "vote_count", parcel$$3 .readString());
        int int$$4 = parcel$$3 .readInt();
        java.util.ArrayList<java.lang.String> list$$2;
        if (int$$4 < 0) {
            list$$2 = null;
        } else {
            list$$2 = new java.util.ArrayList<java.lang.String>();
            for (int int$$5 = 0; (int$$5 <int$$4); int$$5 ++) {
                list$$2 .add(parcel$$3 .readString());
            }
        }
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$0, "genre_ids", list$$2);
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$0, "poster_path", parcel$$3 .readString());
        return popularMovies$$0;
    }

    private com.kalher.henu.popularmovies.APIService.POJO.Genres readcom_kalher_henu_popularmovies_APIService_POJO_Genres(android.os.Parcel parcel$$4) {
        com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$0;
        genres$$0 = new com.kalher.henu.popularmovies.APIService.POJO.Genres();
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$0, "name", parcel$$4 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$0, "id", parcel$$4 .readString());
        return genres$$0;
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_PopularMovieResult(com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult popularMovieResult$$3, android.os.Parcel parcel$$5, int flags$$0) {
        if (InjectionUtil.getField(java.util.List.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult.class, popularMovieResult$$3, "MovieList") == null) {
            parcel$$5 .writeInt(-1);
        } else {
            parcel$$5 .writeInt(InjectionUtil.getField(java.util.List.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult.class, popularMovieResult$$3, "MovieList").size());
            for (com.kalher.henu.popularmovies.APIService.POJO.PopularMovies popularMovies$$2 : ((java.util.List<com.kalher.henu.popularmovies.APIService.POJO.PopularMovies> ) InjectionUtil.getField(java.util.List.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult.class, popularMovieResult$$3, "MovieList"))) {
                if (popularMovies$$2 == null) {
                    parcel$$5 .writeInt(-1);
                } else {
                    parcel$$5 .writeInt(1);
                    writecom_kalher_henu_popularmovies_APIService_POJO_PopularMovies(popularMovies$$2, parcel$$5, flags$$0);
                }
            }
        }
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_PopularMovies(com.kalher.henu.popularmovies.APIService.POJO.PopularMovies popularMovies$$3, android.os.Parcel parcel$$6, int flags$$1) {
        parcel$$6 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "overview"));
        parcel$$6 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "backdrop_Path"));
        parcel$$6 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "release_date"));
        if (InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genres") == null) {
            parcel$$6 .writeInt(-1);
        } else {
            parcel$$6 .writeInt(InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genres").size());
            for (com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$2 : ((java.util.ArrayList<com.kalher.henu.popularmovies.APIService.POJO.Genres> ) InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genres"))) {
                if (genres$$2 == null) {
                    parcel$$6 .writeInt(-1);
                } else {
                    parcel$$6 .writeInt(1);
                    writecom_kalher_henu_popularmovies_APIService_POJO_Genres(genres$$2, parcel$$6, flags$$1);
                }
            }
        }
        parcel$$6 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "vote_average"));
        parcel$$6 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "id"));
        parcel$$6 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "title"));
        parcel$$6 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "vote_count"));
        if (InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genre_ids") == null) {
            parcel$$6 .writeInt(-1);
        } else {
            parcel$$6 .writeInt(InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genre_ids").size());
            for (java.lang.String string$$0 : ((java.util.ArrayList<java.lang.String> ) InjectionUtil.getField(java.util.ArrayList.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "genre_ids"))) {
                parcel$$6 .writeString(string$$0);
            }
        }
        parcel$$6 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.PopularMovies.class, popularMovies$$3, "poster_path"));
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_Genres(com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$3, android.os.Parcel parcel$$7, int flags$$2) {
        parcel$$7 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$3, "name"));
        parcel$$7 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$3, "id"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult getParcel() {
        return popularMovieResult$$0;
    }

    public final static class Creator$$7
        implements Creator<PopularMovieResult$$Parcelable>
    {


        @Override
        public PopularMovieResult$$Parcelable createFromParcel(android.os.Parcel parcel$$8) {
            return new PopularMovieResult$$Parcelable(parcel$$8);
        }

        @Override
        public PopularMovieResult$$Parcelable[] newArray(int size) {
            return new PopularMovieResult$$Parcelable[size] ;
        }

    }

}
