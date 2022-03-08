package com.wangwen.movie.service;

import com.wangwen.common.bean.R;
import com.wangwen.movie.bean.Movie;
import org.springframework.stereotype.Component;

/**
 * @author 王文
 * @date 2021/1/3 22:51
 * @motto 恢弘志士之气，不宜妄自菲薄
 */
@Component
public class MovieFeignExceptionHandlerService implements UserInterfaceFeign {

    @Override
    public R getNewMovie() {
        return R.ok(new Movie(-1, "无此电影啊！"));
    }
}
