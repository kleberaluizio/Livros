package org.example.badCode;

import java.util.ArrayList;
import java.util.List;

// BAD CODE ARTICLE EXAMPLE https://blog.pragmaticengineer.com/bad-code/
public class BadCode {

    public static void main(String[] args) {
        var fizzBuzz = getOutputsFizzBuzz(15);
        System.out.println(fizzBuzz);
    }

    public static List<String> getOutputsFizzBuzz(int n) {
        int FIZZ_DIVISION = 3;
        int BUZZ_DIVISION = 5;
        String FIZZ_OUTPUT = "Fizz";
        String BUZZ_OUTPUT = "Buzz";

        List<String> outputs = new ArrayList<>();
        for (int currentNumber = 1; currentNumber <= n; currentNumber++) {
            boolean isFizzDivision = currentNumber % FIZZ_DIVISION == 0;
            boolean isBuzzDivision = currentNumber % BUZZ_DIVISION == 0;

            if (isFizzDivision && isBuzzDivision) {
                outputs.add(FIZZ_OUTPUT + BUZZ_OUTPUT);
            } else if (isFizzDivision) {
                outputs.add(FIZZ_OUTPUT);
            } else if (isBuzzDivision) {
                outputs.add(BUZZ_OUTPUT);
            } else {
                outputs.add(String.valueOf(currentNumber));
            }
        }
        return outputs;
    }
}
