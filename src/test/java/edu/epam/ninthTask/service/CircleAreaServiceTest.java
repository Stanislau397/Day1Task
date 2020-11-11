package edu.epam.ninthTask.service;

import edu.epam.ninthTask.entity.Radius;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CircleAreaServiceTest {

    @Test
    public void testGetArea() {
        int value = 10;

        Radius radius = new Radius(value);
        CircleAreaService circleAreaService = new CircleAreaService();

        double result = circleAreaService.getArea(radius);
        double expResult = 314.0;

        Assert.assertEquals(result, expResult);
    }
}