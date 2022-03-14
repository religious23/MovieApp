package com.wangwen.ticket.bean;


/**
 * @author xc-ww
 * @version : V1.0
 * @className: TicketVo
 * @description: TODO
 * @date 2022-03-14
 */
public class TicketVo {

    private String ticketId;

    private String movieId;

    private String userId;

    public TicketVo() {
    }

    public TicketVo(String ticketId, String movieId, String userId) {
        this.ticketId = ticketId;
        this.movieId = movieId;
        this.userId = userId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
