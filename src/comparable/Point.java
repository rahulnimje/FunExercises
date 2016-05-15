package com.paypal.comparable;

/**
 * Created by ranimje on 5/5/16.
 */
public class Point implements Comparable<Point> {

    private double x;
    private double y;
    private double d;

    //Using getters to be able to access the values
    //stored in the variables
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getD() {
        return d;
    }

    public Point(double coordX, double coordY){
        this.x = coordX;
        this.y = coordY;
        d = Math.hypot(x, y);
    }


    public int compareTo(Point p){

        return (d > p.d ? 1 : (d < p.d ? -1 : 0));
    }
}
