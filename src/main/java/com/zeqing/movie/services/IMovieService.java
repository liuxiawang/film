package com.zeqing.movie.services;

import com.zeqing.movie.dto.Movie;

import java.util.List;

public interface IMovieService {

    List<Movie> queryMovie(Long id);

    boolean insertMovie(Movie movie);

    boolean deleteById(Long id);

    boolean updateById(Movie movie);
}
