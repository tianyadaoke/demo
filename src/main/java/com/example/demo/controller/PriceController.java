package com.example.demo.controller;

import com.example.demo.VO.PriceVO;
import com.example.demo.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Objects;

@RestController
public class PriceController {
    private PriceService priceService;

    @Autowired
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/brand/{brandId}/product/{productId}")
    public ResponseEntity<PriceVO> findPriceVO(
            @PathVariable("brandId") Integer brandId,
            @PathVariable("productId") Long productId,
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date) {
        PriceVO priceVO = priceService.findPriceVO(brandId, productId, date);
        if (Objects.isNull(priceVO)) {
            return ResponseEntity.status(204).body(null);
        }
        return ResponseEntity.ok(priceVO);
    }
}
