package tasks.shareDemo;

import static java.lang.StrictMath.sqrt;

public class Triangle implements Shape{
    double sideA;
    double sideB;
    double sideC;

    public Triangle() {}
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double getArea() {
        double semiPerimeter = getPerimeter()/2;
        double sum = semiPerimeter * (semiPerimeter-sideA) * (semiPerimeter-sideB) * (semiPerimeter-sideC);
        return sqrt(sum);
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

}
