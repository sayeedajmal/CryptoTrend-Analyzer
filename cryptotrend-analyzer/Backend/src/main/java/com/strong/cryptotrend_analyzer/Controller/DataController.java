package com.strong.cryptotrend_analyzer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.strong.cryptotrend_analyzer.Service.DataProcessingService;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DataProcessingService dataProcessingService;

    @GetMapping("/process")
    public ResponseEntity<String> processData() {
        dataProcessingService.runPythonScript();
        return ResponseEntity.ok("Data processed successfully");
    }
}
