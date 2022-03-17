package com.wangwen.user.service.feign;

import com.wangwen.core.domain.R;
import org.springframework.stereotype.Component;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: TicketFeignExceptionHandlerService
 * @description: TODO
 * @date 2022-03-14
 */
@Component
public class TicketFeignExceptionHandlerService implements TicketInterfaceFeign {
    @Override
    public R queryTicketByMovieId(String movieId) {
        return R.ok(null, "此电影暂无电影票！");
    }

    @Override
    public R buyTicketById(String ticketId, String userId) {
        return R.ok(null, "此电影暂无电影票！");
    }
}
