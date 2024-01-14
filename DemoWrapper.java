public class DemoWrapper
{
	public static void main(String args[])
	{
	
		//Primitive into object
	
		int x=15;
		Integer y=Integer.valueOf(x);
		
		Integer z=x;     //Automatic Integer.valueOf(x) will be called
		System.out.println(x+" " +y+ " "+z);
	}
}
