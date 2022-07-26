public class Circle
{
	protected double radius = 1.0;
	protected String color = "red";
	public Circle()
	{
		this.radius = radius;
		this.color = color;
	}
	public Circle(double radius)
	{
		this.radius = radius;
		this.color = color;
	}
	public Circle( double radius, String color )
	{
		this.radius = radius;
		this.color = color;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public double getArea()
	{
		return Math.PI * getRadius() * getRadius();
	}
	public String toString()
	{
		return this.radius + ", " + this.color + ", " +getArea();
	}
}

