
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
public class Genres$$Parcelable
    implements Parcelable, ParcelWrapper<com.kalher.henu.popularmovies.APIService.POJO.Genres>
{

    private com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Genres$$Parcelable.Creator$$0 CREATOR = new Genres$$Parcelable.Creator$$0();

    public Genres$$Parcelable(android.os.Parcel parcel$$0) {
        com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$2;
        if (parcel$$0 .readInt() == -1) {
            genres$$2 = null;
        } else {
            genres$$2 = readcom_kalher_henu_popularmovies_APIService_POJO_Genres(parcel$$0);
        }
        genres$$0 = genres$$2;
    }

    public Genres$$Parcelable(com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$4) {
        genres$$0 = genres$$4;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$1, int flags) {
        if (genres$$0 == null) {
            parcel$$1 .writeInt(-1);
        } else {
            parcel$$1 .writeInt(1);
            writecom_kalher_henu_popularmovies_APIService_POJO_Genres(genres$$0, parcel$$1, flags);
        }
    }

    private com.kalher.henu.popularmovies.APIService.POJO.Genres readcom_kalher_henu_popularmovies_APIService_POJO_Genres(android.os.Parcel parcel$$2) {
        com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$1;
        genres$$1 = new com.kalher.henu.popularmovies.APIService.POJO.Genres();
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$1, "name", parcel$$2 .readString());
        InjectionUtil.setField(com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$1, "id", parcel$$2 .readString());
        return genres$$1;
    }

    private void writecom_kalher_henu_popularmovies_APIService_POJO_Genres(com.kalher.henu.popularmovies.APIService.POJO.Genres genres$$3, android.os.Parcel parcel$$3, int flags$$0) {
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$3, "name"));
        parcel$$3 .writeString(InjectionUtil.getField(java.lang.String.class, com.kalher.henu.popularmovies.APIService.POJO.Genres.class, genres$$3, "id"));
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.kalher.henu.popularmovies.APIService.POJO.Genres getParcel() {
        return genres$$0;
    }

    public final static class Creator$$0
        implements Creator<Genres$$Parcelable>
    {


        @Override
        public Genres$$Parcelable createFromParcel(android.os.Parcel parcel$$4) {
            return new Genres$$Parcelable(parcel$$4);
        }

        @Override
        public Genres$$Parcelable[] newArray(int size) {
            return new Genres$$Parcelable[size] ;
        }

    }

}
