package edu.epam.seventhTask.main;

import edu.epam.seventhTask.entity.Point;
import edu.epam.seventhTask.report.PointReport;
import edu.epam.seventhTask.service.PointService;

public class Main {

    public static void main(String[] args) {
        int x1 = 5;
        int x2 = 6;
        int y1 = 5;
        int y2 = 7;

        Point pointA = new Point(x1, y1);
        Point pointB = new Point(x2, y2);
        PointService pointService = new PointService();
        PointReport pointReport = new PointReport();

        pointReport.printPointCloserToEntry(pointA, pointB, pointService);

    }
}
