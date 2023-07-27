package com.example.cryptocurrency.service;

import com.example.cryptocurrency.dto.CryptoCurrencyDetailsDTO;
import org.springframework.stereotype.Service;

@Service
public class CryptoCurrencyServiceImpl {

    public CryptoCurrencyDetailsDTO getAllCryptoCurrencyDetails() {
        CryptoCurrencyDetailsDTO cryptoCurrencyDetailsDTO = new CryptoCurrencyDetailsDTO();

        return cryptoCurrencyDetailsDTO;
    }

}
