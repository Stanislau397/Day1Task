package edu.epam.ninthTask.report;

import edu.epam.ninthTask.entity.Radius;
import edu.epam.ninthTask.service.CircleAreaService;

public class CircleAreaReport {

    public void printCircleAreaReport(CircleAreaService circleAreaService, Radius radius) {

        System.out.println("Circle area = " + circleAreaService.getArea(radius));
    }
}
