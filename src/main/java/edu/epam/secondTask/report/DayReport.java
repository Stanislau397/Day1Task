package edu.epam.secondTask.report;

import edu.epam.secondTask.entity.MonthNumber;
import edu.epam.secondTask.entity.YearNumber;

public class DayReport {

    public void printDay(int day, MonthNumber month, YearNumber year) {

        System.out.println("Days in month " + month.getMonthNumber() +
                " year " + year.getYear() + " = " + day);
    }
}
