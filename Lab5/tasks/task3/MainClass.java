package tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<Circle>();
        List<Square> squares = new ArrayList<Square>();

        for(int i=1; i<=3; i++) {
            Circle circle = new Circle(i+1);
            circles.add(circle);
        }

        for(Circle c: circles) {
            System.out.println(c.getRadius());
        }

        for(int i=1; i<=3; i++) {
            Square square = new Square(i*i);
            squares.add(square);
        }

        for(Square s: squares) {
            System.out.println(s.getWidth());
        }


    }
}
