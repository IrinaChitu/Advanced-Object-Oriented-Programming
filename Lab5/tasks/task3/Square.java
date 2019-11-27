package tasks.task3;

public class Square implements Enclosure{
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double perimeter() {
        return 4 * width;
    }

    @Override
    public double area() {
        return width*width;

    }
}
