package com.wangwen.movie.service;

import com.wangwen.core.domain.R;
import com.wangwen.movie.bean.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author W.Wen
 * @version : V1.0
 * @className: UserService
 * @description: 用户业务层
 * @date 2022-01-05
 */
@Service
public class UserService {


    @Autowired
    private UserInterfaceFeign userInterfaceFeign;

    //@HystrixCommand(fallbackMethod = "buyMovieFallbackMethod")
    public R buyMovie(Integer id) {
        return userInterfaceFeign.getNewMovie();
    }

    public Map<String, Object> buyMovieFallbackMethod(Integer id) {
        Map<String, Object> result = new HashMap<>();
        //1.查询用户信息
        //2.查到最新电影票
        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("购买失败！");
        result.put("movie", movie);
        return result;
    }
}
