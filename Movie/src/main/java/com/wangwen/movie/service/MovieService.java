package com.wangwen.movie.service;

import com.wangwen.movie.bean.Movie;

import java.util.List;

/**
 * @author W.Wen
 * @version : V1.0
 * @className: MovieService
 * @description: 电影服务类
 * @date 2022-03-04
 */
public interface MovieService {

    List<Movie> getNewMovie();
}
