package edu.epam.firstTask.service;

import edu.epam.firstTask.entity.Digit;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {

    @Test
    public void testGetLastDigitInSquare() {

        int number = 8;
        Digit digit = new Digit(number);
        NumberService numberService = new NumberService();

        int expResult = 4;
        int result = numberService.getLastDigitInSquare(digit);

        Assert.assertEquals(expResult, result);
    }
}