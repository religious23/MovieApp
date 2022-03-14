package com.wangwen.movie.service.feign;

import com.wangwen.core.domain.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: OrderInterfaceFeign
 * @description: TODO
 * @date 2022-03-14
 */
@FeignClient(value = "ORDER", fallback = TicketFeignExceptionHandlerService.class)
public interface OrderInterfaceFeign {
    @GetMapping("/generateOrder")
    R generateOrder(String ticketId, String userId);
}
