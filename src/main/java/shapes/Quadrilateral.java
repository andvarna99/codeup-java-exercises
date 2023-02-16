package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

//  -----constructor-----
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

//  -----implements measurable-----
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

//  -----accessors-----
    public int getLength() {
        return length;
    }

    public abstract void setLength(double length);

    public int getWidth() {
        return width;
    }

    public abstract void setWidth(double length);
}
