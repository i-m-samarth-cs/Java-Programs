class base
{
	void display()
	{
		System.out.println("Base Class Method");
	}
}
class derived extends base
{
	void display()
	{
		super.display();
		System.out.println("Derived Class Method");
	}
}

class DemoOverride
{
	public static void main(String arg[])
	{
		derived d=new derived();
		d.display();
		
	} 
}