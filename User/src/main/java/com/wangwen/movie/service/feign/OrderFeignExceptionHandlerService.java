package com.wangwen.movie.service.feign;

import com.wangwen.core.domain.R;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: OrderFeignExceptionHandlerService
 * @description: TODO
 * @date 2022-03-14
 */
public class OrderFeignExceptionHandlerService implements OrderInterfaceFeign {
    @Override
    public R generateOrder(String ticketId, String userId) {
        return R.fail("生成订单失败！");
    }
}
