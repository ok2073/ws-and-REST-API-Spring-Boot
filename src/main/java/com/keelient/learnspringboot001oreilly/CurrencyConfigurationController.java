package com.keelient.learnspringboot001oreilly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping(path = "currency-configuration")
@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @GetMapping("/")
    public CurrencyServiceConfiguration retrieveCurrencyProps() {
        return configuration;
    }
}
