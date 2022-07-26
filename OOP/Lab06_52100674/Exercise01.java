public class Exercise01{
	public static void main(String[] args){
	Circle cc=new Circle(3,"green");
	Cylinder cld= new Cylinder(5,10,"yellow");
	
	System.out.println(cc.getRadius());
	System.out.println(cc.getColor());
	System.out.println(cc.getArea());
	System.out.println(cc);
	
	System.out.println(cld.getHeight());
	System.out.println(cld.getVolume());
	System.out.println(cld);
	}
}