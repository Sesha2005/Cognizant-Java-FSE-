package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CountryService {

    List<Country> countries = Arrays.asList(
            new Country("IN", "India"),
            new Country("US", "United States"),
            new Country("JP", "Japan")
    );

    public Country getCountry(String code) {

        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}