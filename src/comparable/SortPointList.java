package com.paypal.comparable;

import java.util.Collections;
import java.util.ArrayList;

/**
 * Created by ranimje on 5/5/16.
 */
public class SortPointList {

    public static void main(String args[]) {
        ArrayList<Point> list = new ArrayList<Point>();
        //Point p0 = new Point(Double.NaN, Double.NaN); list.add(p0);
        Point p1 = new Point(5, 4); list.add(p1);
        Point p2 = new Point(2, 1); list.add(p2);
        Point p3 = new Point(-5, -4); list.add(p3);
        Point p4 = new Point(2, 2); list.add(p4);
        Point p5 = new Point(3, 3); list.add(p5);
        Point p6 = new Point(0, 0); list.add(p6);
        Point p7 = new Point(-1, 5); list.add(p7);
        Point p8 = new Point(0, 5); list.add(p8);
        Point p9 = new Point(1, -5); list.add(p9);
        //Point p10 = new Point(Double.NaN, Double.POSITIVE_INFINITY); list.add(p10);
        //Point p11 = new Point(Double.NaN, Double.NaN); list.add(p11);
        Point p12 = new Point(999999999, 999999998); list.add(p12);
        Point p13 = new Point(999999999, 999999999); list.add(p13);

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getD());
        }
    }
}
