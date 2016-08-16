
package org.parceler;

import java.util.HashMap;
import java.util.Map;
import com.kalher.henu.popularmovies.APIService.POJO.Genres;
import com.kalher.henu.popularmovies.APIService.POJO.Genres$$Parcelable;
import com.kalher.henu.popularmovies.APIService.POJO.MovieImages;
import com.kalher.henu.popularmovies.APIService.POJO.MovieImages$$Parcelable;
import com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult;
import com.kalher.henu.popularmovies.APIService.POJO.MovieImagesResult$$Parcelable;
import com.kalher.henu.popularmovies.APIService.POJO.MovieReviews;
import com.kalher.henu.popularmovies.APIService.POJO.MovieReviews$$Parcelable;
import com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult;
import com.kalher.henu.popularmovies.APIService.POJO.MovieReviewsResult$$Parcelable;
import com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer;
import com.kalher.henu.popularmovies.APIService.POJO.MovieTrailer$$Parcelable;
import com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult;
import com.kalher.henu.popularmovies.APIService.POJO.MovieTrailerResult$$Parcelable;
import com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult;
import com.kalher.henu.popularmovies.APIService.POJO.PopularMovieResult$$Parcelable;
import com.kalher.henu.popularmovies.APIService.POJO.PopularMovies;
import com.kalher.henu.popularmovies.APIService.POJO.PopularMovies$$Parcelable;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2016-06-20T12:24+0530")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Parceler$$Parcels
    implements Repository<org.parceler.Parcels.ParcelableFactory>
{

    private final Map<Class, org.parceler.Parcels.ParcelableFactory> map$$0 = new HashMap<Class, org.parceler.Parcels.ParcelableFactory>();

    public Parceler$$Parcels() {
        map$$0 .put(MovieImages.class, new Parceler$$Parcels.MovieImages$$Parcelable$$0());
        map$$0 .put(MovieReviews.class, new Parceler$$Parcels.MovieReviews$$Parcelable$$0());
        map$$0 .put(MovieReviewsResult.class, new Parceler$$Parcels.MovieReviewsResult$$Parcelable$$0());
        map$$0 .put(Genres.class, new Parceler$$Parcels.Genres$$Parcelable$$0());
        map$$0 .put(MovieTrailerResult.class, new Parceler$$Parcels.MovieTrailerResult$$Parcelable$$0());
        map$$0 .put(MovieImagesResult.class, new Parceler$$Parcels.MovieImagesResult$$Parcelable$$0());
        map$$0 .put(MovieTrailer.class, new Parceler$$Parcels.MovieTrailer$$Parcelable$$0());
        map$$0 .put(PopularMovies.class, new Parceler$$Parcels.PopularMovies$$Parcelable$$0());
        map$$0 .put(PopularMovieResult.class, new Parceler$$Parcels.PopularMovieResult$$Parcelable$$0());
    }

    public Map<Class, org.parceler.Parcels.ParcelableFactory> get() {
        return map$$0;
    }

    private final static class Genres$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<Genres>
    {


        @Override
        public Genres$$Parcelable buildParcelable(Genres input) {
            return new Genres$$Parcelable(input);
        }

    }

    private final static class MovieImages$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<MovieImages>
    {


        @Override
        public MovieImages$$Parcelable buildParcelable(MovieImages input) {
            return new MovieImages$$Parcelable(input);
        }

    }

    private final static class MovieImagesResult$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<MovieImagesResult>
    {


        @Override
        public MovieImagesResult$$Parcelable buildParcelable(MovieImagesResult input) {
            return new MovieImagesResult$$Parcelable(input);
        }

    }

    private final static class MovieReviews$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<MovieReviews>
    {


        @Override
        public MovieReviews$$Parcelable buildParcelable(MovieReviews input) {
            return new MovieReviews$$Parcelable(input);
        }

    }

    private final static class MovieReviewsResult$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<MovieReviewsResult>
    {


        @Override
        public MovieReviewsResult$$Parcelable buildParcelable(MovieReviewsResult input) {
            return new MovieReviewsResult$$Parcelable(input);
        }

    }

    private final static class MovieTrailer$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<MovieTrailer>
    {


        @Override
        public MovieTrailer$$Parcelable buildParcelable(MovieTrailer input) {
            return new MovieTrailer$$Parcelable(input);
        }

    }

    private final static class MovieTrailerResult$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<MovieTrailerResult>
    {


        @Override
        public MovieTrailerResult$$Parcelable buildParcelable(MovieTrailerResult input) {
            return new MovieTrailerResult$$Parcelable(input);
        }

    }

    private final static class PopularMovieResult$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<PopularMovieResult>
    {


        @Override
        public PopularMovieResult$$Parcelable buildParcelable(PopularMovieResult input) {
            return new PopularMovieResult$$Parcelable(input);
        }

    }

    private final static class PopularMovies$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<PopularMovies>
    {


        @Override
        public PopularMovies$$Parcelable buildParcelable(PopularMovies input) {
            return new PopularMovies$$Parcelable(input);
        }

    }

}
