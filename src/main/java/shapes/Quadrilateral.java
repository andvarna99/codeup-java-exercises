package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

//  -----constructor-----
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

//  -----implements measurable-----
    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

//  -----accessors-----
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public abstract double setLength(double length);
    public abstract double setWidth(double width);
}
