class A
{
	void display()
	{
		System.out.println("Class A Method");
	}
}
class B extends A
{
	void display2()
	{
		System.out.println("Class B Method");
	}
}
class C extends B
{
	void display3()
	{
		System.out.println("Class C Method"); 
	}
}
class DemoMultilevel
{
	public static void main(String arg[])
	{
		C obj=new C();
		obj.display();
		obj.display2();
		obj.display3();
	}
}