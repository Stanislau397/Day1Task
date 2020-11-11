package edu.epam.ninthTask.service;

import edu.epam.ninthTask.entity.Radius;

public class CircleAreaService {

    private static final double PI = 3.14;

    public double getArea(Radius radius) {

        return PI * radius.getRadius() * radius.getRadius();
    }
}
