package com.example.demo.repository;

import com.example.demo.entity.Price;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long> {
    @Query("SELECT b.brand_name,p.* FROM brand AS b,price AS p " +
            "WHERE b.brand_id=:brandId and p.start_date<=:date and p.end_date>=:date and p.product_id=:productId " +
            "ORDER BY p.priority DESC LIMIT 1")
    Price findPrice(Integer brandId, Long productId, LocalDateTime date);
}
