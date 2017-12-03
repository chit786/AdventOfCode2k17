package com.aoc;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day3 {
    public static void main(String[] args) {

        List<Point2D> aPoint = new ArrayList<Point2D>();
        HashMap<Point2D, Long> values = new HashMap<Point2D, Long>();
        int distance = 0;
        int range = 1;
        String direction = "right";
        int count = 265149;
        int x = 0;
        int y = 0;
        int step = 1;

        Long value = 0L;

        for (int i = 0; i < count; i++) {
            aPoint.add(i, new Point2D.Double(x, y));
            if (x == 0 && y == 0) {
                values.put(aPoint.get(i), Long.valueOf(1));
            }
            System.out.println(i + " : x :" + x + ", y:" + y + " : value :" + values.get(new Point2D.Double(x, y)));
            if (values.get(new Point2D.Double(x, y)) > count) {
                break;
            }
            distance++;
            switch (direction) {
                case "up": {
                    y += (step);
                    if (aPoint.contains(new Point2D.Double(x - 1, y))) {
                        value = value + values.get(new Point2D.Double(x - 1, y));
                    }
                    if (aPoint.contains(new Point2D.Double(x - 1, y - 1))) {
                        value = value + values.get(new Point2D.Double(x - 1, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y + 1))) {
                        value = value + values.get(new Point2D.Double(x + 1, y + 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y - 1))) {
                        value = value + values.get(new Point2D.Double(x + 1, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x - 1, y + 1))) {
                        value = value + values.get(new Point2D.Double(x - 1, y + 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y))) {
                        value = value + values.get(new Point2D.Double(x + 1, y));
                    }
                    if (aPoint.contains(new Point2D.Double(x, y - 1))) {
                        value = value + values.get(new Point2D.Double(x, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x, y + 1))) {
                        value = value + values.get(new Point2D.Double(x, y + 1));
                    }
                    values.put(new Point2D.Double(x, y), value);
                    value = 0L;
                    if (distance >= range) {
                        direction = "left";
                        distance = 0;
                        range += 1;
                    }
                    break;
                }
                case "right": {
                    x += (step);
                    if (aPoint.contains(new Point2D.Double(x - 1, y))) {
                        value = value + values.get(new Point2D.Double(x - 1, y));
                    }
                    if (aPoint.contains(new Point2D.Double(x - 1, y - 1))) {
                        value = value + values.get(new Point2D.Double(x - 1, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y))) {
                        value = value + values.get(new Point2D.Double(x + 1, y));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y - 1))) {
                        value = value + values.get(new Point2D.Double(x + 1, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x - 1, y + 1))) {
                        value = value + values.get(new Point2D.Double(x - 1, y + 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x, y - 1))) {
                        value = value + values.get(new Point2D.Double(x, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y + 1))) {
                        value = value + values.get(new Point2D.Double(x + 1, y + 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x, y + 1))) {
                        value = value + values.get(new Point2D.Double(x, y + 1));
                    }
                    values.put(new Point2D.Double(x, y), value);
                    value = 0L;
                    if (distance >= range) {
                        direction = "up";
                        distance = 0;
                        //range +=1;
                    }
                    break;
                }
                case "bottom": {
                    y -= (step);
                    if (aPoint.contains(new Point2D.Double(x - 1, y))) {
                        value = value + values.get(new Point2D.Double(x - 1, y));
                    }
                    if (aPoint.contains(new Point2D.Double(x - 1, y - 1))) {
                        value = value + values.get(new Point2D.Double(x - 1, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y))) {
                        value = value + values.get(new Point2D.Double(x + 1, y));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y - 1))) {
                        value = value + values.get(new Point2D.Double(x + 1, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x - 1, y + 1))) {
                        value = value + values.get(new Point2D.Double(x - 1, y + 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x, y - 1))) {
                        value = value + values.get(new Point2D.Double(x, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y + 1))) {
                        value = value + values.get(new Point2D.Double(x + 1, y + 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x, y + 1))) {
                        value = value + values.get(new Point2D.Double(x, y + 1));
                    }
                    values.put(new Point2D.Double(x, y), value);
                    value = 0L;
                    if (distance >= range) {
                        direction = "right";
                        distance = 0;
                        range += 1;
                    }
                    break;
                }
                case "left": {
                    x -= (step);
                    if (aPoint.contains(new Point2D.Double(x - 1, y))) {
                        value = value + values.get(new Point2D.Double(x - 1, y));
                    }
                    if (aPoint.contains(new Point2D.Double(x - 1, y - 1))) {
                        value = value + values.get(new Point2D.Double(x - 1, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y))) {
                        value = value + values.get(new Point2D.Double(x + 1, y));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y - 1))) {
                        value = value + values.get(new Point2D.Double(x + 1, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x + 1, y + 1))) {
                        value = value + values.get(new Point2D.Double(x + 1, y + 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x - 1, y + 1))) {
                        value = value + values.get(new Point2D.Double(x - 1, y + 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x, y - 1))) {
                        value = value + values.get(new Point2D.Double(x, y - 1));
                    }
                    if (aPoint.contains(new Point2D.Double(x, y + 1))) {
                        value = value + values.get(new Point2D.Double(x, y + 1));
                    }
                    values.put(new Point2D.Double(x, y), value);
                    value = 0L;
                    if (distance >= range) {
                        direction = "bottom";
                        distance = 0;
                        //range +=1;
                    }
                    break;
                }
                default:
                    break;
            }

        }
    }
}
