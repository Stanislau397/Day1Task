package edu.epam.ninthTask.service;

import edu.epam.ninthTask.entity.Radius;

public class CircumferenceService {

    private static final double PI = 3.14;
    private static final int C = 2;

    public double getCircumference(Radius radius) {

        return C * PI * radius.getRadius();
    }
}
