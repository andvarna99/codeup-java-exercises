package shapes;

public class Circle {

    private static int circleCounter = 0;



    private double radius;


    public Circle(double radius) {
        this.radius = radius;
        circleCounter++;
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius,2)); // return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    //accessors
    public static int getCircleCounter() {
        return circleCounter;
    }

    public static void setCircleCounter(int circleCounter) {
        Circle.circleCounter = circleCounter;
    }
}
