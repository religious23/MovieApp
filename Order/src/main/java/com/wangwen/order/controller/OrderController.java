package com.wangwen.order.controller;

import com.wangwen.core.domain.R;
import com.wangwen.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: OrderController
 * @description: TODO
 * @date 2022-03-15
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;


    @GetMapping("/generateOrder")
    public R generateOrder(String ticketId, String userId) {
        return R.ok(orderService.generateOrder(ticketId, userId));
    }
}
