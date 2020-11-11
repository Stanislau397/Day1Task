package edu.epam.secondTask.main;

import edu.epam.secondTask.entity.Month;
import edu.epam.secondTask.entity.Year;
import edu.epam.secondTask.report.DayReport;
import edu.epam.secondTask.service.DayService;

public class Main {

    public static void main(String[] args) {
        int monthNumber = 2;
        int yearNumber = 2020;

        Month month = new Month(monthNumber);
        Year year = new Year(yearNumber);
        DayService dayService = new DayService();
        DayReport dayReport = new DayReport();

        dayReport.printDay(dayService.getDayNumber(month, year), month, year);


    }
}
