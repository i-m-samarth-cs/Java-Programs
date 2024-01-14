class Construct
{
	int n1,n2,sum;

	Construct()
	{
		System.out.println("This is Default Constructor");
		n1=10;
		n2=5;
	}
	void cal()
	{
		sum=n1+n2;
		System.out.println("Simulation is "+sum);
	}	
}

class DemoConstruct
{
	public static void main(String args[])
	{
		Construct obj=new Construct();		//Default constr

		obj.cal();
	}
}