package com.zeqing.cinema.services;

import com.zeqing.cinema.dto.Cinema;

import java.util.List;

public interface ICinemaService {

    List<Cinema> query();

    boolean deleteById(Long id);

    boolean insert(Cinema cinema);

    boolean updateById(Cinema cinema);
}
