package com.wangwen.movie.bean;

import java.io.Serializable;

/**
 * @author W.Wen
 * @version : V1.0
 * @className: User
 * @description: 用户实体类
 * @date 2022-01-05
 */
public class User implements Serializable {

    private Integer id;
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
