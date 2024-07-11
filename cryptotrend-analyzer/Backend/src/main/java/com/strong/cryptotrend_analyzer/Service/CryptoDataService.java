package com.strong.cryptotrend_analyzer.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CryptoDataService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String fetchCryptoData(String cryptoName) {
        String url = "https://api.coingecko.com/api/v3/coins/" + cryptoName;
        return restTemplate.getForObject(url, String.class);
    }
}
