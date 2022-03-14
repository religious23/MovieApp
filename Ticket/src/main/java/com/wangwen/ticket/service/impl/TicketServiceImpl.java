package com.wangwen.ticket.service.impl;

import com.wangwen.ticket.bean.TicketVo;
import com.wangwen.ticket.mapper.TicketMapper;
import com.wangwen.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: TicketServiceImpl
 * @description: TODO
 * @date 2022-03-14
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public List<TicketVo> queryTicketByMovieId(String movieId) {
        return ticketMapper.queryTicketByMovieId(movieId);
    }
}
