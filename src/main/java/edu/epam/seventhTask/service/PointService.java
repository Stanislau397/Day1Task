package edu.epam.seventhTask.service;

import edu.epam.seventhTask.entity.Point;

public class PointService {

    public Point getPointCloserToEntry(Point point1, Point point2) {
        double distance1 = calculateDistance(point1);
        double distance2 = calculateDistance(point2);

        if (distance1 < distance2 && distance1 != distance2) {
            return point1;
        }
        return point2;
    }

    public double calculateDistance(Point point) {
        return Math.sqrt((point.getX1() * point.getX1()) +
                point.getY1() * point.getY1());
    }

}
