package edu.epam.thirdTask.main;

import edu.epam.thirdTask.entity.Square;
import edu.epam.thirdTask.report.SquareReport;
import edu.epam.thirdTask.service.SquareService;

public class Main {

    public static void main(String[] args) {
        int area = 10;

        Square square = new Square(area);
        SquareService squareService = new SquareService();
        SquareReport squareReport = new SquareReport();

        squareReport.printArea(squareService.getResult(square), square);
    }
}
