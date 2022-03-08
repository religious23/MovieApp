package com.wangwen.movie.service.impl;

import com.wangwen.movie.bean.Movie;
import com.wangwen.movie.mapper.MovieMapper;
import com.wangwen.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author W.Wen
 * @version : V1.0
 * @className: MovieService
 * @description: 电影业务服务层
 * @date 2022-01-05
 */

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;

    @Value("${server.port}")
    private String port;

    public List<Movie> getNewMovie() {

        System.out.println("服务的端口号：" + port);
        return movieMapper.getNewMovie();
    }
}
