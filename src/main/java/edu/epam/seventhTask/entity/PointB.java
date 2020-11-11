package edu.epam.seventhTask.entity;

public class PointB {

    private int x2;
    private int y2;

    public PointB(int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {

        return x2 + " and " + y2;
    }
}
