package edu.epam.thirdTask.service;

import edu.epam.thirdTask.entity.Square;

public class SquareService {

    private static final int NUMBER = 2;
    private static final int POWER = 2;

    public int getResult(Square square) {

        return (int) Math.pow(Math.sqrt(square.getArea()), POWER) / NUMBER;
    }
}
