package edu.epam.sixthTask.service;

import edu.epam.sixthTask.entity.Second;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SecondServiceTest {

    static final int NUMBER = 558;

    @Test
    public void testGetHours() {
        Second second = new Second(NUMBER);
        SecondService secondService = new SecondService();

        int result = secondService.getHours(second);
        int expResult = 0;

        Assert.assertEquals(result, expResult);
    }

    @Test
    public void testGetMinutes() {
        Second second = new Second(NUMBER);
        SecondService secondService = new SecondService();

        int result = secondService.getMinutes(second);
        int expResult = 9;

        Assert.assertEquals(result, expResult);
    }

    @Test
    public void testGetSeconds() {
        Second second = new Second(NUMBER);
        SecondService secondService = new SecondService();

        int result = secondService.getSeconds(second);
        int expResult = 18;

        Assert.assertEquals(result, expResult);
    }
}