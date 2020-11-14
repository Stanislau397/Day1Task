package edu.epam.secondTask.service;

import edu.epam.secondTask.entity.MonthNumber;
import edu.epam.secondTask.entity.YearNumber;

public class DayService {
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;
    private static final int TEN = 10;
    private static final int ELEVEN = 11;
    private static final int TWELVE = 12;
    private static final int TWENTY_NINE = 29;
    private static final int THIRTY = 30;
    private static final int THIRTY_ONE = 31;
    private static final int FOUR_HUNDRED = 400;
    private static final int ONE_HUNDRED = 100;

    public boolean isLeapYear(int year) {

        return (year % FOUR_HUNDRED == 0)
                || ((year % FOUR == 0)
                && (year % ONE_HUNDRED != 0));
    }

    public boolean isMonthValid(int month) {

        return month >= ONE && month <= TWELVE;
    }

    public int getDayNumber(MonthNumber month, YearNumber year) {

        switch (month.getMonthNumber()) {
            case ONE:
            case THREE:
            case FIVE:
            case SEVEN:
            case EIGHT:
            case TEN:
            case TWELVE:
                if (isMonthValid(month.getMonthNumber())) {
                    return THIRTY_ONE;
                }
                break;

            case FOUR:
            case SIX:
            case NINE:
            case ELEVEN:
                if (isMonthValid(month.getMonthNumber())) {
                    return THIRTY;
                }
                break;

            case TWO:
                if (isMonthValid(month.getMonthNumber()) && isLeapYear(year.getYear())) {
                    return TWENTY_NINE;
                }
                break;

            default:
                System.out.println("There is no such month");
                break;
        }

        return 0;
    }
}

