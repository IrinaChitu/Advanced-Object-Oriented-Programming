package lab2.tasks.task4;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;

public class Shape {
    static int counter = 5;
    public String name;
    public String color;

    public Shape() {}
    public Shape(String name, String color) {
        counter++;
        this.name = name;
        this.color = color;
    }

    public void printShape() {
        System.out.println("name: " + name);
        System.out.println("color: " + color);
    }

    public static void main(String[] args) {
        Shape square = new Shape("Square", "Red");
        Shape circle = new Shape("Circle", "Blue");
        Shape triangle = new Shape("Triangle", "Pink");
        System.out.println("counter: " + Shape.counter);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(circle);
        shapes.add(triangle);
        for(Shape shape: shapes) {
            shape.printShape();
            System.out.println();
        }
    }
}
