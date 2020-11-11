package edu.epam.ninthTask.report;

import edu.epam.ninthTask.entity.Radius;
import edu.epam.ninthTask.service.CircumferenceService;

public class CircumferenceReport {

    public void printCircumferenceReport(CircumferenceService circumferenceService, Radius radius) {

        System.out.println("Circumference = " + circumferenceService.getCircumference(radius));
    }
}
