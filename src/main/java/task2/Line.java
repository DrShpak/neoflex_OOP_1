package task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Line extends Figure {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String getType() {
        return "line";
    }

    @Override
    public double getLength() {
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    @Override
    public double getSquare() {
        return 0;
    }
}
