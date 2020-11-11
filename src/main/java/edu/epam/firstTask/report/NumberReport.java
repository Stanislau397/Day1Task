package edu.epam.firstTask.report;

import edu.epam.firstTask.entity.Digit;
import edu.epam.firstTask.service.NumberService;

public class NumberReport {

    public void printLastDigitInSquare(NumberService numberService, Digit digit) {

        System.out.println("Last digit in square of " + digit.getNumber() +
                " = " + numberService.getLastDigitInSquare(digit));
    }
}
