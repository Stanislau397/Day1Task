package edu.epam.eigthTask.service;

import edu.epam.eigthTask.entity.Digit;

public class FunctionService {

    private static final int POWER_1 = 2;
    private static final int POWER_2 = 3;
    private static final int NUMBER_1 = 3;
    private static final int NUMBER_2 = 9;
    private static final int NUMBER_3 = 6;

    public int getFunctionOne(Digit digit1) {

        return (int) Math.pow(-digit1.getNumber(), POWER_1) * NUMBER_1 *
                digit1.getNumber() + NUMBER_2;
    }

    public int getFunctionTwo(Digit digit2) {

        return 1 / (int) Math.pow(digit2.getNumber(), POWER_2) - NUMBER_3;
    }

    public int getResult(Digit digit3) {

        if (digit3.getNumber() >= NUMBER_1) {
            return getFunctionOne(digit3);
        } else {
            return getFunctionTwo(digit3);
        }
    }
}

