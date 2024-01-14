 class DemoWrap1
{
	public static void main(String args[])
	{
		int x=15;
		Integer y=Integer.valueOf(x);	//Converting int to integer

		Integer z=x;		//compiler will write Integer.valueOf(x) internally

		System.out.println(x+ " " +y+" " +z);
	}
}