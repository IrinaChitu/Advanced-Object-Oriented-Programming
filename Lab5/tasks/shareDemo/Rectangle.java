package tasks.shareDemo;

public class Rectangle implements Shape {
    double sideA;
    double sideB;

    public Rectangle(){}
    public Rectangle(double a, double b) {
        sideA = a;
        sideB = b;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return sideA*sideB;
    }

    @Override
    public double getPerimeter() {
        return 2*sideA + 2*sideB;
    }
}
