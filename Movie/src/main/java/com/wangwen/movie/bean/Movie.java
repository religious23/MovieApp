package com.wangwen.movie.bean;

import java.io.Serializable;

/**
 * @author W.Wen
 * @version : V1.0
 * @className: Movie
 * @description: 电影实体类
 * @date 2022-01-05
 */
public class Movie implements Serializable {

    private Integer id;
    private String movieName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
