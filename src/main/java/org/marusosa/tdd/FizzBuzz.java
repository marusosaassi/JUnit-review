package org.marusosa.tdd;

import java.util.IntSummaryStatistics;

public class FizzBuzz {
    // if a number is visible by 3, print Fizz
    // if a number is visible by 5, print Buzz
    // if a number is visible by 3 and 5, print FizzBuzz
    // if a number is not divisible by 3 or 5, then print the number

    public  static String compute (int i) {
        StringBuilder result = new StringBuilder();
        if(i%3 == 0) {
            result.append("Fizz");
        }
        if(i%5 == 0) {
            result.append("Buzz");
        }
        if(result.isEmpty()) {
            result.append(i);
        }
        return result.toString();
    }

    /*public  static String compute (int i) {
        if((i%3 == 0 ) && (i%5 == 0)) {
            return "FizzBuzz";
        }
        if(i % 3 == 0) {
            return "Fizz";
        }
        if(i % 5 == 0) {
            return "Buzz";
        }
        else {
            return Integer.toString(i);
        }
    }*/


}
