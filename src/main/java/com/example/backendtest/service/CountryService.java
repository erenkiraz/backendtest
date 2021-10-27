package com.example.backendtest.service;

import com.example.backendtest.model.Country;

import java.util.Map;

public interface CountryService {

    Map<String, Country> getAllCountries();
}
