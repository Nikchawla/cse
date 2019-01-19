class Circle
{
	private double radius;
	public double area;
	public void setRadius()
	{
	  radius=5;
	}
	public void getRadius()
	{
	System.out.print(radius);
	}
	void findarea()
	{
	area=3.14*radius*radius;
	}
	void displayarea()
	{
	System.out.println("The area of the traiangle is"+area);
	}
}
class CircleDemo2
{
	public static void main(String args[])
	{
	Circle c=new Circle();
	c.setRadius();
	c.getRadius();
	c.findarea();
	c.displayarea();
	}
}