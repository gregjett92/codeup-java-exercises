package shapes;

public class Square extends Rectangle {
//======== CONSTRUCTOR ========
    public Square(double side) {
        super(side, side);
    }

//=========== METHOD ============
    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }
}