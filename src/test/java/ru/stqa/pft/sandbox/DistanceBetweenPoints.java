package ru.stqa.pft.sandbox;


public class DistanceBetweenPoints {

    public static void main(String[] args) {
        Point p1 = new Point(5, 4);
        Point p2 = new Point(7, 3);
        System.out.println("дистаниция между точками А с координатами " + p1.x + " и " + p1.y + " и B с координатами " + p2.x + " и "
                + p2.y + " = " + Math.sqrt(p1.distance(p1, p2) + p2.distance(p1, p2)));
    }

}
