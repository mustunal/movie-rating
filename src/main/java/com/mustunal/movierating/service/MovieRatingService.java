package com.mustunal.movierating.service;

import com.mustunal.movierating.domain.MovieRating;
import com.mustunal.movierating.repository.MovieRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieRatingService {

    private final MovieRatingRepository movieRatingRepository;

    @Autowired
    public MovieRatingService(MovieRatingRepository movieRatingRepository) {
        this.movieRatingRepository = movieRatingRepository;
    }

    public MovieRating getMovieRating(long id) {
        return movieRatingRepository.getMovieRating(id);
    }
}
