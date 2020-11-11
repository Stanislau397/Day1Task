package edu.epam.firstTask.main;

import edu.epam.firstTask.entity.Digit;
import edu.epam.firstTask.report.NumberReport;
import edu.epam.firstTask.service.NumberService;

public class Main {

    public static void main(String[] args) {
        int number = 8;

        Digit digit = new Digit(number);
        NumberService numberService = new NumberService();
        NumberReport numberReport = new NumberReport();

        numberReport.printLastDigitInSquare(numberService, digit);
    }
}
