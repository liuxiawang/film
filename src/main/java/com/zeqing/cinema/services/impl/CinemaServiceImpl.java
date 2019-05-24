package com.zeqing.cinema.services.impl;

import com.zeqing.cinema.dto.Calendar;
import com.zeqing.cinema.dto.Cinema;
import com.zeqing.cinema.mappers.CinemaMapper;
import com.zeqing.cinema.services.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements ICinemaService {

    @Autowired
    private CinemaMapper cinemaMapper;

    @Override
    public List<Cinema> query() {
        List<Cinema> cinemas = cinemaMapper.query();
        if (cinemas.size() > 0)
            for (Cinema cinema: cinemas) {
                cinema.setCalendars(cinemaMapper.queryCalendarByCinemaId(cinema.getId()));
                cinema.setSnacks(cinemaMapper.querySnackByCinemaId(cinema.getId()));
            }
        return cinemas;
    }

    @Override
    public boolean deleteById(Long id) {
        return cinemaMapper.deleteById(id);
    }

    @Override
    public boolean insert(Cinema cinema) {
        return cinemaMapper.insert(cinema);
    }

    @Override
    public boolean updateById(Cinema cinema) {
        return cinemaMapper.updateById(cinema);
    }
}
