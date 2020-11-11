package edu.epam.thirdTask.report;

import edu.epam.thirdTask.entity.Square;

public class SquareReport {

    public void printArea(int number, Square square) {

        System.out.println("" + square.getArea() + " = " + number);
    }
}
