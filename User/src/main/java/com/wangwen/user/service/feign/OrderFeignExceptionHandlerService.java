package com.wangwen.user.service.feign;

import com.wangwen.core.domain.R;
import org.springframework.stereotype.Component;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: OrderFeignExceptionHandlerService
 * @description: TODO
 * @date 2022-03-14
 */
@Component
public class OrderFeignExceptionHandlerService implements OrderInterfaceFeign {
    @Override
    public R generateOrder(String ticketId, String userId) {
        return R.fail("生成订单失败！");
    }
}
