package edu.epam.seventhTask.service;

import edu.epam.seventhTask.entity.PointA;
import edu.epam.seventhTask.entity.PointB;

public class PointService {

    public int getPointCloserToEntry(PointA a, PointB b) {

        return (a.getX1() * a.getX1() + a.getY1() * a.getY1()) -
                (b.getX2() * b.getX2() + b.getY2() * b.getY2());
    }

}
