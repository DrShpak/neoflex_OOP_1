package task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends Figure {
    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String getType() {
        return "rectangle";
    }

    @Override
    public double getLength() {
        return (new Line(p1, new Point(p1.getX(), p2.getY())).getLength()
                + new Line(new Point(p1.getX(), p2.getY()), p2).getLength())
                * 2;
    }

    @Override
    public double getSquare() {
        return new Line(p1, new Point(p1.getX(), p2.getY())).getLength()
                * new Line(new Point(p1.getX(), p2.getY()), p2).getLength();
    }
}