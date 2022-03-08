package com.wangwen.movie.service;

import com.wangwen.common.bean.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author W.Wen
 * @version : V1.0
 * @className: UserInterface
 * @description: feign的声明式调用
 * @date 2022-01-05
 */
@FeignClient(value = "MOVIE", fallback = MovieFeignExceptionHandlerService.class)
public interface UserInterfaceFeign {
    @GetMapping("/movie")
    R getNewMovie();
}
