public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();

        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(String color, boolean filled) {
        super.color = color;
        super.filled = filled;
    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super.color = color;
        super.filled = filled;
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.length + this.width) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", length = " + this.length + ",  width = " + this.width + "]";
    }
}
