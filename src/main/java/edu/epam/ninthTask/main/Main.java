package edu.epam.ninthTask.main;

import edu.epam.ninthTask.entity.Radius;
import edu.epam.ninthTask.report.CircleAreaReport;
import edu.epam.ninthTask.report.CircumferenceReport;
import edu.epam.ninthTask.service.CircleAreaService;
import edu.epam.ninthTask.service.CircumferenceService;

public class Main {

    public static void main(String[] args) {

        int value = 10;

        Radius radius = new Radius(value);
        CircleAreaService circleAreaService = new CircleAreaService();
        CircumferenceService circumferenceService = new CircumferenceService();

        CircleAreaReport circleAreaReport = new CircleAreaReport();
        CircumferenceReport circumferenceReport = new CircumferenceReport();

        circleAreaReport.printCircleAreaReport(circleAreaService, radius);
        circumferenceReport.printCircumferenceReport(circumferenceService, radius);
    }
}
