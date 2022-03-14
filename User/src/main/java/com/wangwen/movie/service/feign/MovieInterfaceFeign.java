package com.wangwen.movie.service.feign;

import com.wangwen.core.domain.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author W.Wen
 * @version : V1.0
 * @className: UserInterface
 * @description: feign的声明式调用
 * @date 2022-01-05
 */
@FeignClient(value = "MOVIE", fallback = MovieFeignExceptionHandlerService.class)
public interface MovieInterfaceFeign {
    @GetMapping("/buyMovie")
    R getNewMovie(@RequestParam("id") String id);
}
