package shapes;

public class Square extends Quadrilateral {
    public Square(double s){
        super(s,s);
    }

    @Override
    public void setLength(double l) {
        this.length = l;
    }

    @Override
    public void setWidth(double w) {
        this.width = w;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }
}