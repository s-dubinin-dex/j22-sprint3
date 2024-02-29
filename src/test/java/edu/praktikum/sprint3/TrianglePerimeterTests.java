package edu.praktikum.sprint3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TrianglePerimeterTests {
    private final int side1;
    private final int side2;
    private final int side3;
    private final int expectedResult;

    public TrianglePerimeterTests(int side1, int side2, int side3, int expectedResult) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {2, 3, 4, 9},
                {3, 4, 5, 12}
        };
    }
    @Test
    public void perimeterTest() {
        Triangle triangle = new Triangle(side1, side2, side3);
        assertEquals("Perimeter is incorrect", expectedResult, triangle.perimeter());
    }

}
