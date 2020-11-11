package edu.epam.secondTask.report;

import edu.epam.secondTask.entity.Month;
import edu.epam.secondTask.entity.Year;

public class DayReport {

    public void printDay(int day, Month month, Year year) {

        System.out.println("Days in month " + month.getMonthNumber() +
                " year " + year.getYear() + " = " + day);
    }
}
