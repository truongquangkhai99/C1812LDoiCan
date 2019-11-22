package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Rectangle {
    private Point pA, pB, pC, pD;
    private ArrayList<Point> points = new ArrayList<>();
    public Rectangle(Point pA, Point pB, Point pC, Point pD) {
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
        this.pD = pD;
        points.add(pA);
        points.add(pB);
        points.add(pC);
        points.add(pD);
    }

    private double getMinX() {
        double minX = Double.MAX_VALUE;
        for(Point p: points) {
            if(p.getX() < minX) {
                minX = p.getX();
            }
        }
        return minX;
    }
    private double getMaxX() {
        double maxX = Double.MIN_VALUE;
        for(Point p: points) {
            if(p.getX() > maxX) {
                maxX= p.getX();
            }
        }
        return maxX;
    }
    private double getMinY() {
        double minY = Double.MAX_VALUE;
        for(Point p: points) {
            if(p.getY() < minY) {
                minY= p.getY();
            }
        }
        return minY;
    }
    private double getMaxY() {
        double maxY = Double.MIN_VALUE;
        for(Point p: points) {
            if(p.getY() > maxY) {
                maxY= p.getY();
            }
        }
        return maxY;
    }
    public Boolean checkCollision(Rectangle rectangle) {
        if (this.getMaxX() < rectangle.getMinX() ||
                rectangle.getMaxX() < this.getMinX()) {
            return false;
        }
        if (this.getMaxY() < rectangle.getMinY() ||
                rectangle.getMaxY() < this.getMinY()) {
            return false;
        }
        return true;

    }
}
