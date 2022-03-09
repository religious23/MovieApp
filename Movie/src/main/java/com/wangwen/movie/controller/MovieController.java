package com.wangwen.movie.controller;

import com.wangwen.core.domain.R;
import com.wangwen.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author W.Wen
 * @version : V1.0
 * @className: MovieController
 * @description: 电影服务控制层
 * @date 2022-01-05
 */
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movie")
    public R getNewMovie(String id) {
        return R.ok(movieService.getNewMovie(id));
    }
}
