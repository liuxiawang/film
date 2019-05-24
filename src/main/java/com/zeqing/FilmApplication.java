package com.zeqing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zeqing.**.mappers")
public class FilmApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmApplication.class, args);
	}

}
