package com.alcor.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author guchun
 * @description TODO
 * @date 2022/6/24 15:01
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reduce")
    public String reduce() {
        System.out.println("master");
        System.out.println("扣除");
        return "reduce";
    }
}
