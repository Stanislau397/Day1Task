package edu.epam.secondTask.service;

import edu.epam.secondTask.entity.Month;
import edu.epam.secondTask.entity.Year;

public class DayService {

    public boolean isLeapYear(int year) {

        return (year % 400 == 0)
                || ((year % 4 == 0)
                && (year % 100 != 0));
    }

    public boolean isMonthValid(int month) {

        return month >= 1 && month <= 12;
    }

    public int getDayNumber(Month month, Year year) {

        switch (month.getMonthNumber()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (isMonthValid(month.getMonthNumber())) {
                    return 31;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (isMonthValid(month.getMonthNumber())) {
                    return 30;
                }
                break;

            case 2:
                if (isMonthValid(month.getMonthNumber()) && isLeapYear(year.getYear())) {
                    return 29;
                }
                break;

            default:
                System.out.println("There is no such month");
                break;
        }

        return 0;
    }
}

