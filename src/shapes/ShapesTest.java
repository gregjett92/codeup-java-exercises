package shapes;

import java.util.concurrent.RecursiveAction;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Square(4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
//        These will fail, myShape type is Measurable
//        System.out.println(myShape.getLength);
//        System.out.println(myShape.getWidth);

        Measurable myShape2 = new Rectangle(5,10);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());

//        Quadrilateral is your toolbox
//        Methods you have available are determined by the type of variable
//        The implementations (the way you use the tools) is determined by the instance
//        of the Object

        Rectangle myRectangle = new Rectangle(3,2);
//        this works, because the variable we call the method on is of type Rectangle
        System.out.println(myRectangle.getColor());

        Quadrilateral myShape3 = myRectangle;
//        this does not work, because we are of a Quadrilateral type.
//        System.out.println(myShape3.getColor());
        System.out.println(myShape3.getPerimeter());

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());

//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

    }

}