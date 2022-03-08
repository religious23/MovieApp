package com.wangwen.movie.mapper;

import com.wangwen.movie.bean.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author W.Wen
 * @version : V1.0
 * @className: MovieDao
 * @description: 电影数据交互层
 * @date 2022-01-05
 */
@Mapper
public interface MovieMapper {
    List<Movie> getNewMovie();
}
