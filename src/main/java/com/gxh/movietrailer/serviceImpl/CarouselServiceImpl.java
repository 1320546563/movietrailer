package com.gxh.movietrailer.serviceImpl;

import com.gxh.movietrailer.dataobject.Carousel;
import com.gxh.movietrailer.repository.CarouselRepository;
import com.gxh.movietrailer.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselRepository carouselRepository;

    @Override
    public List<Carousel> findAll() {
        return carouselRepository.findAll();
    }
}
