package com.example.backendtest.service;

import com.example.backendtest.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.springframework.http.HttpMethod.GET;

@Service
public class CountryServiceImpl implements CountryService {


    private String dataLinkUrl = "https://raw.githubusercontent.com/mledoze/countries/master/countries.json";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Map<String, Country> getAllCountries() {
        ResponseEntity<List<Country>> response =
                restTemplate.exchange(dataLinkUrl, GET, null, new ParameterizedTypeReference<List<Country>>() {
                });

        List<Country> countries = response.getBody();

        return countries.stream()
                .collect(Collectors.toMap(Country::getName, c -> c));
    }
}
