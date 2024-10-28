public class Drawing {

    private Drawing(){}

    static private Drawing drawing = null;

    static Drawing getInstance(){

        if (drawing == null){
            drawing = new Drawing();
        }

        return drawing;
    }

    public void drawShape(Shape shape){

        String type;
        String colour;
        double area;

        if (shape instanceof Square){
            Square square = (Square) shape;
            type = "Square";
            colour = shape.getColor();
            area = square.calculateArea();
        }
        else{
            Circle circle = (Circle) shape;
            type = "Circle";
            colour = shape.getColor();
            area = circle.calculateArea();
        }

        System.out.println("This is a " + type + " with Colour " + colour + " and area " + area);
    }
}