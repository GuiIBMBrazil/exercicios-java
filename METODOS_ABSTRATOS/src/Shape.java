public abstract class Shape{
    protected COLOR color;

    public Shape() {
    }

    public abstract double area();

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }


}