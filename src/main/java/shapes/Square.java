package shapes;

public class Square extends Quadrilateral{
    private double side;
    public Square(double side) {
        super( side, side);
        this.side = side;
    }

    @Override
    public double setLength(double length) {
        return this.side = length;
    }

    @Override
    public double setWidth(double width) {
        return this.side = width;
    }
//    private final int side;
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public int getArea() {
//        return side * side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * side;
//    }

}
