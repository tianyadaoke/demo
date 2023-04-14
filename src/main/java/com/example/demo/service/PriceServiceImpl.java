package com.example.demo.service;

import com.example.demo.VO.PriceVO;
import com.example.demo.entity.Price;
import com.example.demo.repository.PriceRepository;
import com.example.demo.utils.PriceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class PriceServiceImpl implements PriceService {
    private PriceRepository priceRepository;

    @Autowired
    public PriceServiceImpl(PriceRepository repository) {
        this.priceRepository = repository;
    }

    @Override
    public PriceVO findPriceVO(Integer brandId, Long productId, LocalDateTime date) {
        Price price = priceRepository.findPrice(brandId, productId, date);
        return Objects.isNull(price) ? null : PriceUtils.convertFrom(price);
    }
}
