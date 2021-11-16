package task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square extends Figure {
    private Point p1;
    private Point p2;

    public Square(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String getType() {
        return "square";
    }

    @Override
    public double getLength() {
        return new Line(p1, new Point(p1.getX(), p2.getY())).getLength() * 4;
    }

    @Override
    public double getSquare() {
        return Math.pow(new Line(p1, new Point(p1.getX(), p2.getY())).getLength(), 2);
    }
}
