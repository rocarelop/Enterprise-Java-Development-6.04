package com.ironhack.priceproxyservice.controller.impl;

import com.ironhack.priceproxyservice.model.Money;
import com.ironhack.priceproxyservice.controller.interfaces.PriceController;
import com.ironhack.priceproxyservice.service.interfaces.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class PriceControllerImpl implements PriceController {
    @Autowired
    private PriceService priceService;

    @PostMapping("/prices")
    @ResponseStatus(HttpStatus.OK)
    public Money convert(@RequestParam Money moneyUSD, @RequestParam String currency) {

        return priceService.convert(moneyUSD,currency);
    }
}
