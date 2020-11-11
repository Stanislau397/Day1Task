package edu.epam.eigthTask.report;

import edu.epam.eigthTask.entity.Digit;
import edu.epam.eigthTask.service.FunctionService;

public class FunctionReport {

    public void printFunctionReport(FunctionService functionService, Digit digit) {

        System.out.println("F" + "(" + digit.getNumber() + ")" +
                " = " + functionService.getResult(digit));
    }
}
