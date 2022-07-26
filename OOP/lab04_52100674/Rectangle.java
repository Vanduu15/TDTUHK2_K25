public class Rectangle {
    private float width = 1f;
    private float length = 1f;

    public Rectangle (){}
    public Rectangle(float width, float length){
        this.width=width;
        this.length=length;
    }
    public float getLength(){
        return this.length;
    }
    public float getWidth(){
        return this.width;
    }
    public float getArea(){
        return this.width*this.length;
    }
    public float getPerimeter(){
        return (this.length+this.width)*2;
    }
    public void setWidth(float width){
        if(width>0){
            this.width=width;
        }
    }
    public void setLength(float length){
        if(length>0){
            this.length=length;
        }
    }
    public String toString(){
        return String.format("Rectangle[%f,%f]",
                        this.width,this.length);
    }
}
