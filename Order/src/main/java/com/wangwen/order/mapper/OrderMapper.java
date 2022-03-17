package com.wangwen.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: OrderMapper
 * @description: TODO
 * @date 2022-03-15
 */
@Mapper
public interface OrderMapper {
    Integer generateOrder(@Param("ticketId") String ticketId, @Param("userId") String userId);
}
