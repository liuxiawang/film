package com.zeqing.cinema.mappers;

import com.zeqing.cinema.dto.Calendar;
import com.zeqing.cinema.dto.Cinema;
import com.zeqing.cinema.dto.Snack;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CinemaMapper {

    List<Cinema> query();

    boolean deleteById(@Param("id") Long id);

    boolean insert(@Param("cinema") Cinema cinema);

    boolean updateById(@Param("cinema") Cinema cinema);

    List<Calendar> queryCalendarByCinemaId(@Param("cinemaId") Long cinemaId);

    List<Snack> querySnackByCinemaId(@Param("cinemaId") Long cinemaId);
}
