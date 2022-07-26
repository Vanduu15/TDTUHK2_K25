public class Exercise02 {
    public static void main(String[] args){
        Rectangle r1=new Rectangle(5,7);
        Rectangle r2=new Rectangle(1,2);

        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());

        r1.setLength(15);
        r2.setWidth(10);

        System.out.println(r1);
        System.out.println(r2);
    }
}
