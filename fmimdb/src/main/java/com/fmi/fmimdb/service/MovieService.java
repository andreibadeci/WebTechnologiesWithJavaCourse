package com.fmi.fmimdb.service;

import com.fmi.fmimdb.model.Movie;
import com.fmi.fmimdb.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void addMovie(Movie movie) {
        movieRepository.addMovie(movie);
    }

    public void removeMovie(Movie movie) {
        movieRepository.removeMovie(movie);
    }

    public void updateMovie(Movie originalMovie, Movie updatedMovie) {
        movieRepository.updateMovie(originalMovie, updatedMovie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.getAllMovies();
    }

}
