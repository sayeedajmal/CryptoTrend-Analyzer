package com.strong.cryptotrend_analyzer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.strong.cryptotrend_analyzer.Service.CryptoDataService;

@RestController
@RequestMapping("/api/crypto")
public class CryptoController {

    @Autowired
    private CryptoDataService cryptoDataService;

    @GetMapping("/data")
    public ResponseEntity<String> getCryptoData(@RequestParam String cryptoName) {
        String responseData = cryptoDataService.fetchCryptoData(cryptoName);
        return ResponseEntity.ok(responseData);
    }
}
