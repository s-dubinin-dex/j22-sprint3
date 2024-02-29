package edu.praktikum.sprint3;

public class Triangle {
    private final int side1;
    private final int side2;
    private final int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int perimeter(){
        return side1 + side2 + side3;
    }

    public long square(){
        double halfPerimeterer = perimeter() / 2.0;

        return Math.round(Math.sqrt(halfPerimeterer
                * (halfPerimeterer - side1)
                * (halfPerimeterer - side2)
                * (halfPerimeterer - side3)));
    }

    public int maxSide(){
        int max = side1;
        for (int side: new int[]{side2, side3}){
            if (side > max){
                max = side;
            }
        }
        return max;
    }

}
