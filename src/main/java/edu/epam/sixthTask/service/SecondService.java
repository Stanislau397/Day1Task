package edu.epam.sixthTask.service;

import edu.epam.sixthTask.entity.Second;

public class SecondService {

    private static final int SECONDS_IN_HOUR = 3600;
    private static final int MINUTES_IN_HOUR = 60;

    public int getHours(Second second) {

        return second.getNumber() / SECONDS_IN_HOUR;
    }

    public int getMinutes(Second second) {

        return (second.getNumber() - (getHours(second) /
                SECONDS_IN_HOUR)) / MINUTES_IN_HOUR;
    }

    public int getSeconds(Second second) {

        return (second.getNumber() - getHours(second)) -
                getMinutes(second) * MINUTES_IN_HOUR;
    }
}
