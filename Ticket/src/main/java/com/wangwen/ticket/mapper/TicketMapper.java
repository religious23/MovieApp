package com.wangwen.ticket.mapper;

import com.wangwen.ticket.bean.TicketVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: TicketMapper
 * @description: TODO
 * @date 2022-03-14
 */
@Mapper
public interface TicketMapper {

    List<TicketVo> queryTicketByMovieId(@Param("movieId") String movieId);
}
