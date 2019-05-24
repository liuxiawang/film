package com.zeqing.movie.services.impl;

import com.zeqing.movie.dto.Movie;
import com.zeqing.movie.mappers.MovieMapper;
import com.zeqing.movie.services.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public List<Movie> queryMovie(Long id) {
        return movieMapper.queryMovie(id);
    }

    @Override
    public boolean insertMovie(Movie movie) {
        movieMapper.insertMovie(movie);
        return true;
    }

    @Override
    public boolean deleteById(Long id) {
        movieMapper.deleteById(id);
        return true;
    }

    @Override
    public boolean updateById(Movie movie) {
        movieMapper.updateById(movie);
        return true;
    }
}
