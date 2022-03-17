package com.wangwen.user.service;

import com.wangwen.core.domain.R;
import com.wangwen.user.bean.Movie;
import com.wangwen.user.service.feign.MovieInterfaceFeign;
import com.wangwen.user.service.feign.OrderInterfaceFeign;
import com.wangwen.user.service.feign.TicketInterfaceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
    private MovieInterfaceFeign movieInterfaceFeign;

    @Autowired
    private TicketInterfaceFeign ticketInterfaceFeign;

    @Autowired
    private OrderInterfaceFeign orderInterfaceFeign;

    //@HystrixCommand(fallbackMethod = "buyMovieFallbackMethod")
    public R buyMovie(String id) {
        return movieInterfaceFeign.getNewMovie(id);
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

    public R queryTicketByMovieId(String movieId) {
        return ticketInterfaceFeign.queryTicketByMovieId(movieId);
    }

    public R buyTicketById(String ticketId, String userId) {
        ticketInterfaceFeign.buyTicketById(ticketId, userId);
        orderInterfaceFeign.generateOrder(ticketId, userId);
        return R.ok("买票成功！");
    }
}
