package com.zeqing.movie.mappers;

import com.zeqing.movie.dto.Movie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MovieMapper {

    List<Movie> queryMovie(@Param("id") Long id);

    boolean insertMovie(@Param("movie") Movie movie);

    boolean deleteById(@Param("id") Long id);

    boolean updateById(@Param("movie") Movie movie);
}
