package com.wangwen.movie.controller;

import com.wangwen.common.bean.R;
import com.wangwen.movie.service.UserService;
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
    public R buyMovie(@RequestParam("id") Integer userId) {
        return userService.buyMovie(userId);
    }

}
