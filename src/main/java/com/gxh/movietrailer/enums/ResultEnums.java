package com.gxh.movietrailer.enums;

import lombok.Getter;

@Getter
public enum ResultEnums {
    PARAM_ERROR(1,"表单参数不正确");
    private Integer code;
    private String message;

    ResultEnums(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
