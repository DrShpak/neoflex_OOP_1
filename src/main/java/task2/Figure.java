package task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Figure {
    private String type;
    private double length;
    private double square;

    @Override
    public String toString() {
        return "type='" + getType() + '\'' +
                ", length=" + getLength() +
                ", square=" + getSquare() +
                '}';
    }
}
