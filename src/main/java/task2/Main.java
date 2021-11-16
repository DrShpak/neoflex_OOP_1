package task2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //upcasting
        Figure point1 = new Point(10, 10);
        Figure point2 = new Point(20, 20);
        Figure line1 = new Line(new Point(10, 10), new Point(12, 20));
        Figure line2 = new Line(new Point(12, 20), new Point(20, 20));
        Figure circle = new Circle(new Point(0, 0), 5);

        // downcasting in arguments
        Figure square = new Square((Point) point1, (Point) point2);

        var rectangle = new Rectangle(new Point(1, 2), new Point(12, 12));
        var parallelogram = new Parallelogram(new Line(new Point(10, 10), new Point(12, 20)),
                new Line(new Point(12, 20), new Point(20, 20)), 40);
        Figure triangle = new Triangle(new Point(1, 2), new Point(2, 7), new Point(7, 2));

        var figures = List.of(point1, point2,
                line1, line2,
                circle,
                square,
                rectangle,
                parallelogram,
                triangle);

        figures.forEach(x -> System.out.println(x));
    }
}
