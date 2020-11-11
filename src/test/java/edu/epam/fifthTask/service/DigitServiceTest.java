package edu.epam.fifthTask.service;

import edu.epam.fifthTask.entity.Digit;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DigitServiceTest {

    @Test
    public void testIsPerfectTrue() {

        int number = 6;

        Digit digit = new Digit(number);
        DigitService digitService = new DigitService();

        boolean condition = digitService.isPerfect(digit);

        Assert.assertTrue(condition);

    }

    @Test
    public void testIsPerfectFalse() {

        int number = 7;

        Digit digit = new Digit(number);
        DigitService digitService = new DigitService();

        boolean condition = digitService.isPerfect(digit);

        Assert.assertFalse(condition);

    }
}