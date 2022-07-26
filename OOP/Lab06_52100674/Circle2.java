public class Circle2 extends Shape {
    private double radius = 1;

    public Circle2() {

    }

    public Circle2(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double width) {
        this.radius = width;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle[%s-%f]", this.color, this.radius);
    }
}
