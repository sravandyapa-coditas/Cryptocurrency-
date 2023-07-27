package com.example.cryptocurrency.api;

import com.example.cryptocurrency.dto.CryptoCurrencyDetailsDTO;
import com.example.cryptocurrency.service.CryptoCurrencyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CryptoCurrencyResource {

    @Autowired
    private CryptoCurrencyServiceImpl cryptoCurrencyServiceImpl;

    @GetMapping("/getAllCryptoCurrencies")
    public CryptoCurrencyDetailsDTO getAllCryptoCurrencyDetails() {
        return cryptoCurrencyServiceImpl.getAllCryptoCurrencyDetails();
    }

}
