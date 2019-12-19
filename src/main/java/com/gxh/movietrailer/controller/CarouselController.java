package com.gxh.movietrailer.controller;

import com.gxh.movietrailer.VO.ResultVO;
import com.gxh.movietrailer.dataobject.Carousel;
import com.gxh.movietrailer.service.CarouselService;
import com.gxh.movietrailer.utils.ResultVOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/index")
public class CarouselController {
    @Autowired
    private CarouselService carouselService;

    @RequestMapping("/carouselList")
    public ResultVO<List<Carousel>>list (HttpServletRequest request, HttpServletResponse response){
        List<Carousel> carouselList = carouselService.findAll();
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Cache-Control","no-cache");
        return ResultVOUtils.success(carouselList);
    }
}
