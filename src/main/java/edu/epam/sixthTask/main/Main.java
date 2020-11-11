package edu.epam.sixthTask.main;

import edu.epam.sixthTask.entity.Second;
import edu.epam.sixthTask.report.SecondReport;
import edu.epam.sixthTask.service.SecondService;

public class Main {

    public static void main(String[] args) {

        int seconds = 558;

        Second second = new Second(seconds);
        SecondService secondService = new SecondService();
        SecondReport secondReport = new SecondReport();

        secondReport.printSecondReport(second, secondService);
    }
}
