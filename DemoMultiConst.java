class Construct
{
	int n1,n2,sum;
	Construct()
	{
		n1=2;
		n2=3;		//Defination of Default constructor
	}
	
	Construct(int a,int b)
	{
		System.out.println("This is parameterized constructor");
		n1=a;
		n2=b;
	}
	void cal()
	{
		sum=n1+n2;
		System.out.println("Sum= "+sum);
	}
}
class DemoMultiConst
{
	public static void main(String args[])
	{
		Construct c=new Construct();		//Calling Default Constructor
		c.cal();

		Construct c1=new Construct(20,10);	//Calling Parameterized constructor
		c1.cal();
		//c.cal();
	}
}