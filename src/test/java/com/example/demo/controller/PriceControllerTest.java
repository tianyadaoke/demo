package com.example.demo.controller;

import com.example.demo.VO.PriceVO;
import com.example.demo.service.PriceService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler;

import java.time.LocalDateTime;


@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    PriceService priceService;

    @Test
    public void testGetPriceVOSuccess() throws Exception {
        var date = LocalDateTime.of(2020, 1, 1, 1, 1, 1);
        var startDate = LocalDateTime.of(2020, 1, 1, 1, 1, 1);
        var endDate = LocalDateTime.of(2020, 1, 1, 1, 1, 10);
        Mockito.when(priceService.findPriceVO(1, 2L, date))
                .thenReturn(new PriceVO(2L, "ZARA", 2L, startDate, endDate, "100EUR"));
        mockMvc.perform(MockMvcRequestBuilders.get("/brand/1/product/2?date=2020-01-01T01:01:05"))
                .andExpect(handler().handlerType(PriceController.class))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.finalPrice").value("100EUR"));
    }
}
