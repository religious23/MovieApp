package com.wangwen.ticket.service;

import com.wangwen.ticket.bean.TicketVo;

import java.util.List;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: TicketService
 * @description: TODO
 * @date 2022-03-14
 */
public interface TicketService {
    List<TicketVo> queryTicketByMovieId(String movieId);

    Integer buyTicketById(String ticketId, String userId);
}
