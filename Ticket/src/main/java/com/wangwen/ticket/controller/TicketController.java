package com.wangwen.ticket.controller;

import com.wangwen.core.domain.R;
import com.wangwen.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xc-ww
 * @version : V1.0
 * @className: TicketController
 * @description: 票 controller
 * @date 2022-03-14
 */
@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/queryTicketByMovieId")
    public R queryTicketByMovieId(String movieId) {
        return R.ok(ticketService.queryTicketByMovieId(movieId));
    }
}
