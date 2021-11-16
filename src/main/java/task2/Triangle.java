package task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle extends Figure {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public String getType() {
        return "triangle";
    }

    @Override
    public double getLength() {
        return new Line(p1, p2).getLength() + new Line(p1, p3).getLength() + new Line(p2, p3).getLength();
    }

    @Override
    public double getSquare() {
        return Math.sqrt((getLength() / 2)
                * ((getLength() / 2) - (new Line(p1, p2)).getLength())
                * ((getLength() / 2) - (new Line(p1, p3)).getLength())
                * ((getLength() / 2) - (new Line(p2, p3)).getLength()));
    }
}
