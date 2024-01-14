interface Area
{
	final static float pi=3.14f;
	float compute(float x,float y);
}
class Rectangle implements Area
{
	public float compute(float x,float y)
	{
		return(x*y);
	}
}
class Triangle implements Area
{
	public float compute(float x,float y)
	{
		return(0.5f*x*y);
	}
}
class DemoInterface
{
	public static void main(String args[])
	{
		Rectangle rect=new Rectangle();
		Triangle tri=new Triangle();
		
		float result;
		result=rect.compute(20,30);
		System.out.println("Area of Rectangle " +result);
		result=tri.compute(10,30);
		System.out.println("Area of Triangle " +result);
		
	}
}