import java.util.*;
class Person
{
	String name;
	int age;
	Scanner s=new Scanner(System.in);
	void getData()		
	{

		System.out.println("Enter name");
		name=s.next();
		System.out.println("Enter age : ");
		age=s.nextInt();
	}
}
class Emp extends Person
{
	String emp_designation;
	double salary;
	
	void getData()
	{
		super.getData();	
		System.out.println("Enter Employee Desigantion");
		emp_designation=s.next();
		System.out.println("Enter Salary");
		salary=s.nextDouble();
	}		
	void display()
	{
		System.out.println(" Name :" +name);
		System.out.println("Age :" +age);
		System.out.println("Employee Designation :" +emp_designation);
		System.out.println("Salary : "+salary);
	}
	
}
class DemoPerson
{
	public static void main(String args[])
	{
		Emp e=new Emp();
		e.getData();
		e.display();		
	}
}
 