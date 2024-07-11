package com.strong.cryptotrend_analyzer.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataProcessingService {

    public void runPythonScript() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/main/resources/scripts/DataProcess.py");
            Process p = pb.start();
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
