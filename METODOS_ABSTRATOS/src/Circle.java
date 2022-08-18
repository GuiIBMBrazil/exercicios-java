public class Circle extends Shape{
    private double radius;

    public Circle(double radius,COLOR color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double area() {
        return 3.14159*Math.pow(radius,2);
    }
}