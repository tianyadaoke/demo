package com.example.demo.utils;

import com.example.demo.VO.PriceVO;
import com.example.demo.entity.Price;

public class PriceUtils {
    public static PriceVO convertFrom(Price price) {
        return new PriceVO(price.getProductId(),
                price.getBrandName(),
                price.getPriceList(),
                price.getStartDate(),
                price.getEndDate(),
                price.getPrice()+price.getCurr());
    }
}
