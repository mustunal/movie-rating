package com.mustunal.movierating.controller;

import com.mustunal.movierating.domain.MovieRating;
import com.mustunal.movierating.service.MovieRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movie-rating")
public class MovieRatingController {

    private final MovieRatingService movieRatingService;

    @Autowired
    public MovieRatingController(MovieRatingService movieRatingService) {
        this.movieRatingService = movieRatingService;
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/{id}")
    public MovieRating getMovieRating(@PathVariable long id){
        return movieRatingService.getMovieRating(id);
    }
}
