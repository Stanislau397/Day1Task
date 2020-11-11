package edu.epam.sixthTask.report;

import edu.epam.sixthTask.entity.Second;
import edu.epam.sixthTask.service.SecondService;

public class SecondReport {

    public void printSecondReport(Second second, SecondService secondService) {

        System.out.println(secondService.getHours(second) + " hours " + secondService.getMinutes(second) +
                " minutes " + secondService.getSeconds(second) + " seconds past");
    }
}
