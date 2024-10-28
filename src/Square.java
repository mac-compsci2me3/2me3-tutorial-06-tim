public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSideLength() {
        return side;
    }

    public void setSideLength(double side) {
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side * side;
    }
}