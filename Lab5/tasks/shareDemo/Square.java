package tasks.shareDemo;

public class Square extends Rectangle {
    double side;

    public Square(){}
    public Square(double a, double b, double side) {
        super(a, b);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}
