package edu.epam.eigthTask.main;

import edu.epam.eigthTask.entity.Digit;
import edu.epam.eigthTask.report.FunctionReport;
import edu.epam.eigthTask.service.FunctionService;

public class Main {

    public static void main(String[] args) {

        int number = 5;

        Digit digit = new Digit(number);
        FunctionService functionService = new FunctionService();
        FunctionReport functionReport = new FunctionReport();

        functionReport.printFunctionReport(functionService, digit);
    }
}
