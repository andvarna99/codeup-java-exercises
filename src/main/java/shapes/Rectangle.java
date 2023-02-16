package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(int length, int width) {
        super(length, width);
    }
    @Override
    public double getPerimeter(){
        return (2 * length)+(2 * width);
    }
    @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public double setLength(double length) {
        return length;
    }

    @Override
    public double setWidth(double width) {
        return width;
    }

//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//    public int getArea(){
//        return length * width;
//    }
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
//
//    //accessors
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
}
