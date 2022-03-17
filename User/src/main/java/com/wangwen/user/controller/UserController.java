package com.wangwen.user.controller;

import com.wangwen.core.domain.R;
import com.wangwen.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author W.Wen
 * @version : V1.0
 * @className: UserController
 * @description: 用户控制层
 * @date 2022-01-05
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/buyMovie")
    public R buyMovie(@RequestParam("id") String userId) {
        return userService.buyMovie(userId);
    }


    @GetMapping("/queryTicketByMovieId")
    public R queryTicketByMovieId(@RequestParam("movieId") String movieId) {
        return userService.queryTicketByMovieId(movieId);
    }

    @GetMapping("/buyTicketById")
    public R buyTicketById(@RequestParam("ticketId")String ticketId,  @RequestParam("userId")String userId) {
        return userService.buyTicketById(ticketId,userId);
    }
}
