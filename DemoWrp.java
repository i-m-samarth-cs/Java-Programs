class DemoWrp
{
	public static void main(String arg[])
	{
		//object into primitive
		Integer x=new Integer(10);
		
		int y=x.intValue();	//converting integer to int
	
		int z=x; // compiler will write x.intValue internally
		System.out.println(x+ " " +y+" "+ z);
	}
}