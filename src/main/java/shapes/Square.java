package shapes;

public class Square extends Rectangle{
    public Square(int side) {
        super(side, side);
    }
    public double getArea(double side){
        return Math.pow(side,2);

    }
    public int getPerimeter(int side){
        return 4 * side;
    }
}
