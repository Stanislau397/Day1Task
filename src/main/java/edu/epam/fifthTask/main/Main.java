package edu.epam.fifthTask.main;

import edu.epam.fifthTask.entity.Digit;
import edu.epam.fifthTask.report.DigitReport;
import edu.epam.fifthTask.service.DigitService;

public class Main {

    public static void main(String[] args) {

        int number = 6;

        Digit digit = new Digit(number);
        DigitService digitService = new DigitService();
        DigitReport digitReport = new DigitReport();

        digitReport.printPerfectReport(true, digit.getNumber());

    }
}
