package com.wangwen.order.service;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: OrderService
 * @description: TODO
 * @date 2022-03-15
 */
public interface OrderService {
    Integer generateOrder(String ticketId, String userId);
}
