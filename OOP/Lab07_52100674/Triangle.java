public class Triangle extends Shape() {
    private double base,height;
    
    public Triangle(){
        super();
    }
    public Triangle(double base; double height, String color){
        super(color);
        this.base=base;
        this.height=height;
    }
    @Override
    public double getArea() {
        return 0.5*this.base*this.height;
    }
    @Override
    public String toString() {
        return String.format("Triangle[%.2f, %.2f,%s]",
        this.base,this.height,this.color);
    }
    
}