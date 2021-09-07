package com.mycompany.dvdstore.core.repository;

import com.mycompany.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {


    void create(Movie movie);

    public Movie getById(long id);

    List<Movie> list();

}
