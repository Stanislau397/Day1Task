package edu.epam.seventhTask.report;

import edu.epam.seventhTask.entity.Point;
import edu.epam.seventhTask.service.PointService;

public class PointReport {

    public void printPointCloserToEntry(Point point1, Point point2, PointService pointService) {

        System.out.println("The closest point to start of coordinates is " +
                pointService.getPointCloserToEntry(point1, point2));
    }
}
