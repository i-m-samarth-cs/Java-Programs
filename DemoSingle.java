
class A
{
	void displayBase()
	{
		System.out.println("base class method");
	}
}
class B extends A
{
	void displayDerived()
	{
		System.out.println("derived Class Method");
	}
}
class DemoSingle
{
	public static void main(String args[])
	{
		B o=new B();
		o.displayDerived();
		o.displayBase();
	}
}