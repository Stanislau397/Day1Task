package edu.epam.firstTask.service;

import edu.epam.firstTask.entity.Digit;

public class NumberService {

    private static final int POWER = 2;
    private static final int VALUE = 10;

    public int getLastDigitInSquare(Digit digit) {

        return (int) Math.pow(digit.getNumber(), POWER) % VALUE;
    }
}
