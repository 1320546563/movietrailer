package com.gxh.movietrailer.VO;

import lombok.Data;

/**
 * 接口文档的形式
 * @param <T>
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String message;

    private T data;
}
