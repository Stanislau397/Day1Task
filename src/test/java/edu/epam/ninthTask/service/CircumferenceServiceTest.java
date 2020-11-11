package edu.epam.ninthTask.service;

import edu.epam.ninthTask.entity.Radius;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CircumferenceServiceTest {

    @Test
    public void testGetCircumference() {
        int number = 10;

        Radius radius = new Radius(number);
        CircumferenceService circumferenceService = new CircumferenceService();

        double result = circumferenceService.getCircumference(radius);
        double expResult = 62.800000000000004;

        Assert.assertEquals(result, expResult);
    }
}