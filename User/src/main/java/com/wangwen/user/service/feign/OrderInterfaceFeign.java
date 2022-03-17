package com.wangwen.user.service.feign;

import com.wangwen.core.domain.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: OrderInterfaceFeign
 * @description: TODO
 * @date 2022-03-14
 */
@FeignClient(value = "ORDER", fallback = OrderFeignExceptionHandlerService.class)
public interface OrderInterfaceFeign {
    @GetMapping("/generateOrder")
    R generateOrder(@RequestParam("ticketId")String ticketId,@RequestParam("userId") String userId);
}
