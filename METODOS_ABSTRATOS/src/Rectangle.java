public class Rectangle extends Shape{
    private double width;
    private double height;


    public Rectangle(double height, double width, COLOR color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public double area() {
        return width*height;
    }
}