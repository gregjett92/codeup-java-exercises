package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    String color = "blue";
    public Rectangle(double l, double w){
        super(l, w);
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
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    public String getColor(){
        return color;
    }
}