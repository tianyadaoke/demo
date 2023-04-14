package com.example.demo.VO;

import java.time.LocalDateTime;

public class PriceVO {
    private Long productId;
    private String brandName;
    private Long priceList;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String finalPrice;

    public PriceVO(Long productId, String brandName, Long priceList, LocalDateTime startDate, LocalDateTime endDate, String finalPrice) {
        this.productId = productId;
        this.brandName = brandName;
        this.priceList = priceList;
        this.startDate = startDate;
        this.endDate = endDate;
        this.finalPrice = finalPrice;
    }

    public Long getProductId() {
        return productId;
    }

    public String getBrandName() {
        return brandName;
    }

    public Long getPriceList() {
        return priceList;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getFinalPrice() {
        return finalPrice;
    }
}
