package shapes;

public class Rectangle {

    protected double length;
    protected double width;


//    ========= CONSTRUCTOR ========
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
//    ======== METHODS =======
    public double getArea() {
        return length * width;

    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}


