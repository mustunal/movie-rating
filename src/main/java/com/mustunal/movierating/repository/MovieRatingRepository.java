package com.mustunal.movierating.repository;

import com.mustunal.movierating.domain.MovieRating;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MovieRatingRepository {

    private Map<Long, MovieRating> movieRatingMap = new HashMap<>();

    public MovieRatingRepository() {
        initMovieRatingMap();
    }

    private void initMovieRatingMap() {
        MovieRating movieRating = new MovieRating(1,8);
        movieRatingMap.put(1L,movieRating);

        movieRating = new MovieRating(2,9);
        movieRatingMap.put(2L,movieRating);

        movieRating = new MovieRating(3,7);
        movieRatingMap.put(3L,movieRating);
    }

    public MovieRating getMovieRating(long id) {
        return movieRatingMap.get(id);
    }
}
