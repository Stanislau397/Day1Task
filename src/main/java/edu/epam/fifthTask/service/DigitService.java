package edu.epam.fifthTask.service;

import edu.epam.fifthTask.entity.Digit;

public class DigitService {

    public boolean isPerfect(Digit digit) {
        int sum = 0;

        for (int i = 1; i < digit.getNumber(); i++) {

            if (digit.getNumber() % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == digit.getNumber()) {
            return true;
        }

        return false;
    }
}
