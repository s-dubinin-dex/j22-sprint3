package edu.praktikum.sprint3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleMaxSideTest {
    @Test
    public void maxSideTest() {
        Triangle triangle = new Triangle(1, 2, 3);
        assertEquals("max Side is incorrect",3, triangle.maxSide());
    }
}