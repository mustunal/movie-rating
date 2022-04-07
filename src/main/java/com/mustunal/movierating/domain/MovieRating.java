package com.mustunal.movierating.domain;

public class MovieRating {

    private long id;
    private float rating;

    public MovieRating() {
    }

    public MovieRating(long id, float rating) {
        this.id = id;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
