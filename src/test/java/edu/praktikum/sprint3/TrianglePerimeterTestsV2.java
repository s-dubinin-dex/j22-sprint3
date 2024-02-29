package edu.praktikum.sprint3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TrianglePerimeterTestsV2 {
    @Parameterized.Parameter
    public int side1;
    @Parameterized.Parameter(1)
    public int side2;
    @Parameterized.Parameter(2)
    public int side3;
    @Parameterized.Parameter(3)
    public int expectedResult;

    @Parameterized.Parameters(name = "Triangle with sides [{0}, {1}, {2}] has perimeter {3}")
    public static Object[][] getTestData(){
        return new Object[][]{
                {2, 3, 4, 9},
                {3, 4, 5, 12}
        };
    }
    @Test
    public void perimeterTest(){
        Triangle triangle = new Triangle(side1, side2, side3);
        assertEquals("Perimeter is incorrect", expectedResult, triangle.perimeter());
    }
}
