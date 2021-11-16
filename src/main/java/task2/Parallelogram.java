package task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parallelogram extends Figure {
    private Line line1;
    private Line line2;
    private double angle;

    public Parallelogram(Line line1, Line line2, double angle) {
        this.line1 = line1;
        this.line2 = line2;
        this.angle = angle;
    }

    @Override
    public String getType() {
        return "parallelogram";
    }

    @Override
    public double getLength() {
        return (line1.getLength() + line2.getLength()) * 2;
    }

    @Override
    public double getSquare() {
        return line1.getLength() * line2.getLength() * Math.sin(angle);
    }
}