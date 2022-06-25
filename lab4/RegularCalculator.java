package com.company.lab4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularCalculator {
    public void findSolution(String line) {
        int firstValue = 0;
        int secondValue = 0;
        int result = 0;
        Pattern pattern = Pattern.compile("(\\d+)([-+*/])(\\d*)");
        Matcher matcher = pattern.matcher(line);
        String operation;

        while (matcher.find()) {
            firstValue = Integer.parseInt(matcher.group(1));
            secondValue = Integer.parseInt(matcher.group(3));
            operation = matcher.group(2);
            switch (operation) {
                case "-":
                    result = firstValue - secondValue;
                    break;
                case "+":
                    result = firstValue + secondValue;
                    break;
                case "/":
                    if (secondValue != 0) {
                        result = firstValue / secondValue;
                        break;
                    } else {
                        System.out.println(firstValue + operation + secondValue + "is not correct");
                        continue;
                    }
                case "*":
                    result = firstValue * secondValue;
                    break;
            }
            System.out.println(firstValue + operation + secondValue + " = " + result);
        }


    }
}