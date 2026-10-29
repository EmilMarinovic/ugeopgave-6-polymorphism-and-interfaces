package Del2;

public class Square implements Shape{
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        return width * 4;
    }

    @Override
    public String toString() {
        return getArea() + " area - " + getPerimeter() + " perimeter";
    }
}
