package edu.epam.fifthTask.report;

public class DigitReport {

    public void printPerfectReport(boolean flag, int number) {

        if (flag) {
            System.out.println(number + " is a Perfect number");
        } else {
            System.out.println(number + " is not a Perfect number");
        }
    }
}
