package com.gxh.movietrailer.exceptions;

import com.gxh.movietrailer.enums.ResultEnums;
import lombok.Data;

@Data
public class MovieTrailerException extends  RuntimeException {

    private Integer code;
    public MovieTrailerException(ResultEnums resultEnums){
        super(resultEnums.getMessage());
        this.code = resultEnums.getCode();
    }
    public MovieTrailerException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
