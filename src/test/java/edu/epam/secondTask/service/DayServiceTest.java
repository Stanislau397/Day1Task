package edu.epam.secondTask.service;

import edu.epam.secondTask.entity.MonthNumber;
import edu.epam.secondTask.entity.YearNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DayServiceTest {

    @Test
    public void testIsLeapYearTrue() {
        int yearNumber = 2020;

        YearNumber year = new YearNumber(yearNumber);
        DayService dayService = new DayService();

        boolean result = dayService.isLeapYear(year.getYear());

        Assert.assertTrue(result);
    }

    @Test
    public void testIsLeapYearFalse() {
        int yearNumber = 2019;

        YearNumber year = new YearNumber(yearNumber);
        DayService dayService = new DayService();

        boolean condition = dayService.isLeapYear(year.getYear());

        Assert.assertFalse(condition);
    }


    @Test
    public void testIsMonthValidTrue() {
        int monthNumber = 2;

        MonthNumber month = new MonthNumber(monthNumber);
        DayService dayService = new DayService();

        boolean condition = dayService.isMonthValid(month.getMonthNumber());

        Assert.assertTrue(condition);
    }

    public void testIsMonthValidFalse() {
        int monthNumber = 15;

        MonthNumber month = new MonthNumber(monthNumber);
        DayService dayService = new DayService();

        boolean condition = dayService.isMonthValid(month.getMonthNumber());

        Assert.assertTrue(condition);

    }

    @Test
    public void testGetDayNumber() {

        int monthNumber = 2;
        int yearNumber = 2020;

        MonthNumber month = new MonthNumber(monthNumber);
        YearNumber year = new YearNumber(yearNumber);
        DayService dayService = new DayService();

        int result = dayService.getDayNumber(month, year);
        int expResult = 29;

        Assert.assertEquals(result, expResult);

    }
}