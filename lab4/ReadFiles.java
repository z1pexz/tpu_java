package com.company.lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {

    public void readFile() {
        try {
            String filePath = "src/com/company/lab4/file.txt";
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            RegularCalculator regularCalculator = new RegularCalculator();
            while (line != null) {
                regularCalculator.findSolution(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}