import java.util.*;
class Box
{
	double width,w;
	double height,h;
	double depth,d;
	void setDim()
	{
	w=width;
	h=height;
	d=depth;
	}
	double volume()
	{
	return w*h*d;
	}
}
class BoxDemo
{
	public static void main(String args[])
	{
double vol;
Scanner s1 =new Scanner(System.in);
	Box b1 = new Box();
	b1.width=s1.nextInt();
	b1.height=s1.nextInt();
	b1.depth=s1.nextInt();
	
	b1.width=2;
	b1.height=3;
	b1.depth=10;
	b1.setDim();
	vol=b1.volume();
	
	System.out.print("The volume is"+vol);
	}
}