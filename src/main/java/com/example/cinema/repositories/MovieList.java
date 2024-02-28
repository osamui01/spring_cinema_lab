package com.example.cinema.repositories;

import com.example.cinema.models.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class MovieList {
    private ArrayList<Movie> movies;
    public MovieList(){
        this.movies = new ArrayList<>();
    }
    public void addMovie (Movie movie){
        this.movies.add(movie);
    }
    public Movie getMovieByID(int id){
        return this.movies.get(id-1);
    }
}
