package com.mycompany.dvdstore.core.service;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMovieService implements MovieServiceInterface{

    //private MovieRepository movieRepository = new MovieRepository();

    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){

         movieRepository.create(movie);

    }

    @Override
    public List<Movie> getMovieList() {

        return movieRepository.list();

    }

    @Override
    public Movie getMovieById(Long id) {

        System.out.println("id :"+id);
        return movieRepository.getById(id);
    }
}
