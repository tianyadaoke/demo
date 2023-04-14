package com.example.demo.service;

import com.example.demo.VO.PriceVO;

import java.time.LocalDateTime;

public interface PriceService {
    PriceVO findPriceVO(Integer brandId, Long productId, LocalDateTime date);
}
