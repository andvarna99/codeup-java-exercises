package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape1;

        myShape1 = new Square(5);
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());

        Measurable myShape2;
        myShape2 = new Rectangle(5,4);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());

//        Rectangle box1 = new Rectangle(5,4);
//
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        //check to see the right one is printing by souting in the og class methods

    }
}
