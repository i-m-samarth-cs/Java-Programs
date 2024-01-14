import java.util.*;
class Rectangle
{
	float length,width;
	Rectangle(float a, float b)
	{
		length=a;
		width=b;
	}		
	float RectArea()
	{
		return(length*width);
	}
}

class RectangleArea
{
	public static void main(String args[])
	{
		float l,b;
		System.out.println("Enter length and breath of Rectangle");
		Scanner s=new Scanner(System.in);
		l=s.nextFloat();
		b=s.nextFloat();
		Rectangle r1=new Rectangle(l,b);
		float area=r1.RectArea();
		System.out.println("Area ="+area);
	}
}