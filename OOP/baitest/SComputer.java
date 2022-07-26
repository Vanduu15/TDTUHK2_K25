public class SComputer extends Computer{
	private String series;

public SComputer(){

}
public SComputer(String series, String name, String color, double price){
	this.series =series;
	this.name = name;
	this.color = color;
	this.price=price;
}
public double getSalePrice(){
	return 
}
@Override
public String toString(){
	return super.toString() + "\t" +series;
}