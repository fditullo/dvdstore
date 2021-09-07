package com.mycompany.dvdstore.core.repository.memory;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    private static List<Movie> movies = new ArrayList<>();

    private MovieServiceInterface movieService;

    public void create(Movie movie) {

        movies.add(movie);
        System.out.println("Movie added with title " + movie.getTitle() + " and genre " + movie.getGenre());

    }

    @Override
    public Movie getById(long id) {
        return movies.stream().
                   filter(m -> m.getId() == id).
                    findFirst().get();

    }

    @Override
    public List<Movie> list() {
        return movies;
    }

}
