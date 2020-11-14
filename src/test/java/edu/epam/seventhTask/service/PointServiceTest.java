package edu.epam.seventhTask.service;

import edu.epam.seventhTask.entity.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointServiceTest {

    @Test
    public void testGetPointCloserToEntry() {
        int x1 = 5;
        int x2 = 6;
        int y1 = 5;
        int y2 = 7;

        Point pointA = new Point(x1, y1);
        Point pointB = new Point(x2, y2);
        PointService pointService = new PointService();

        Point result = pointService.getPointCloserToEntry(pointA, pointB);
        Point expResult = pointA;

        Assert.assertEquals(result, expResult);
    }
}