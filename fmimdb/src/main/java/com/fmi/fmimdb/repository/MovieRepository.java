package com.fmi.fmimdb.repository;

import com.fmi.fmimdb.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    private List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie) {
        movieList.add(movie);
        System.out.println("Added movie " + movie.toString());
    }

    public void removeMovie(Movie movie) {
        movieList.remove(movie);
        System.out.println("Removed movie " + movie.toString());
    }

    public void updateMovie(Movie originalMovie, Movie updatedMovie) {
        movieList.set(movieList.indexOf(originalMovie), updatedMovie);
        System.out.println("Updated movie " + originalMovie.toString() + " to " + updatedMovie.toString());
    }

    public List<Movie> getAllMovies() {
        return movieList;
    }

}
