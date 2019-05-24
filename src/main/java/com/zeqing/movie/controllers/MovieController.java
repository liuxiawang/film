package com.zeqing.movie.controllers;

import com.zeqing.movie.dto.Movie;
import com.zeqing.movie.services.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 查询电影列表
// 查询电影详情（与列表接口合并）
// 新增电影
// 删除电影
// 编辑电影

@RestController
@RequestMapping(value = "/v1/movie")
public class MovieController {

    @Autowired
    private IMovieService movieService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Movie> queryMovie(@RequestParam(name = "id", required = false) Long id) {
        return movieService.queryMovie(id);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public boolean insertMovie(@RequestBody Movie movie) {
        return movieService.insertMovie(movie);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public boolean deleteById(@RequestParam("id") Long id) {
        return movieService.deleteById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public boolean updateById(@RequestBody Movie movie) {
        return movieService.updateById(movie);
    }

}
