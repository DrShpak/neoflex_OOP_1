package task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle extends Figure {
    private Point centre;
    private double radius;

    public Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "circle";
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
