interface class GeometricObject
{

	double getarea();
	double getperimeter();
}
class Circle implements GeometricObject
{
	public double radius=1.0;
	double Area;
    double Perimeter;
	public Circle()
	{
	this.radius=radius;
	}

	public double getArea()
	{
    Area=3.14*radius*radius;
    return Area;
	}
	public double getPerimeter()
	{
	Perimeter=2*3.14*radius;
	return Perimeter;
	}
}


interface Resizable
{
	public double(int percent);
}



class ResizableCircle implements Resizable extends Circle
{
	ResizableCircle(double radius)
	{
	this.radius=radius;
	}
	public double Resizable(int percent)
	{
	radius=(radius*percent)/100;
	}
}

class Test2
{
	public static void main(String args[])
	{
	Circle c=new Circle();
	c.getArea();
	c.getPerimeter();
	c.radius();
	c.Resizable();
	}
}