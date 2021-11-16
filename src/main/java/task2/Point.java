package task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point extends Figure {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getType() {
        return "point";
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public double getSquare() {
        return 0;
    }


}
