package edu.epam.seventhTask.service;

import edu.epam.seventhTask.entity.PointA;
import edu.epam.seventhTask.entity.PointB;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointServiceTest {

    @Test
    public void testGetPointCloserToEntry() {
        int x1 = 5;
        int x2 = 6;
        int y1 = 4;
        int y2 = 8;

        PointA pointA = new PointA(x1, y1);
        PointB pointB = new PointB(x2, y2);
        PointService pointService = new PointService();

        int result = pointService.getPointCloserToEntry(pointA, pointB);
        int expResult = -59;

        Assert.assertEquals(result, expResult);
    }
}