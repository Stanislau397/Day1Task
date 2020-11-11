package edu.epam.seventhTask.report;

import edu.epam.seventhTask.entity.PointA;
import edu.epam.seventhTask.entity.PointB;
import edu.epam.seventhTask.service.PointService;

public class PointReport {

    public void printPointCloserToEntry(PointService pointService, PointA a, PointB b) {

        if (pointService.getPointCloserToEntry(a, b) < 0) {
            System.out.println(a.toString() + " are closer");
        } else if (pointService.getPointCloserToEntry(a, b) > 0) {
            System.out.println(b.toString() + " are closer");
        } else {
            System.out.println("They are equally close");
        }
    }
}
