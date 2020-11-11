package edu.epam.eigthTask.service;

import edu.epam.eigthTask.entity.Digit;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionServiceTest {

    @Test
    public void testGetFunctionOne() {
        int number = 3;

        Digit digit = new Digit(number);
        FunctionService functionService = new FunctionService();

        int result = functionService.getFunctionOne(digit);
        int expResult = 90;

        Assert.assertEquals(result, expResult);
    }

    @Test
    public void testGetFunctionTwo() {
        int number = 3;

        Digit digit = new Digit(number);
        FunctionService functionService = new FunctionService();

        int result = functionService.getFunctionTwo(digit);
        int expResult = -6;

        Assert.assertEquals(result, expResult);
    }

    @Test
    public void testGetResult() {
        int number = 3;

        Digit digit = new Digit(number);
        FunctionService functionService = new FunctionService();

        int result = functionService.getResult(digit);
        int expResult = 90;

        Assert.assertEquals(result, expResult);
    }
}