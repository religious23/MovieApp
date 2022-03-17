package com.wangwen.order.service.impl;

import com.wangwen.order.mapper.OrderMapper;
import com.wangwen.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: OrderServiceImpl
 * @description: TODO
 * @date 2022-03-15
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Integer generateOrder(String ticketId, String userId) {
        return orderMapper.generateOrder(ticketId,userId);
    }
}
