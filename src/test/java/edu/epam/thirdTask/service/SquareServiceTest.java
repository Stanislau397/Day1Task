package edu.epam.thirdTask.service;

import edu.epam.thirdTask.entity.Square;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SquareServiceTest {

    @Test
    public void testGetResult() {
        int area = 10;

        Square square = new Square(area);
        SquareService squareService = new SquareService();

        int result = 5;
        int expResult = squareService.getResult(square);

        Assert.assertEquals(result, expResult);


    }
}