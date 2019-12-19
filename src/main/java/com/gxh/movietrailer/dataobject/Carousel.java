package com.gxh.movietrailer.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Carousel {
    /*id*/
    @Id
    private int id;

    /*图片id*/
    private String movieId;

    /*图片地址*/
    private String image;

    private int sort;

    private int isShow;
}
