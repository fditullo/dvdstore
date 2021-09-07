package com.mycompany.dvdstore.core.service;

import com.mycompany.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {

    public void registerMovie(Movie movie);

    public List<Movie> getMovieList();

    public Movie getMovieById(Long id);


}
