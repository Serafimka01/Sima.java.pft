package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testPoint(){
        Point p1 = new Point(3, 5);
        Point p2 = new Point(5, 9);

        Assert.assertEquals(Math.sqrt(p1.distance(p1, p2) + p2.distance(p1, p2)), 4.47213595499958);
    }
}
