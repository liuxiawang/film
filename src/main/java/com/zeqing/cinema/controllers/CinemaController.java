package com.zeqing.cinema.controllers;

import com.zeqing.cinema.dto.Cinema;
import com.zeqing.cinema.services.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/cinema")
public class CinemaController {

    @Autowired
    private ICinemaService cinemaService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Cinema> query() {
        return cinemaService.query();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public boolean deleteById(@RequestParam("id") Long id) {
        return cinemaService.deleteById(id);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public boolean insert(@RequestBody Cinema cinema) {
        return cinemaService.insert(cinema);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public boolean updateById(@RequestBody Cinema cinema) {
        return cinemaService.updateById(cinema);
    }

}
