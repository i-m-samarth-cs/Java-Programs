import java.util.*;
class Student 
{
	String name;
	int rno,m1,m2;

	Scanner s=new Scanner(System.in);
	
	void getData()
	{
		System.out.println("Enter Name");
		name=s.next();
		System.out.println("Enter Roll number");
		rno=s.nextInt();
		System.out.println("Enter Mark1 and Mark2");
		m1=s.nextInt();
		m2=s.nextInt();
	}
	void putData()
	{
		System.out.println(rno+ "\t\t" +name+ "\t" +m1+ "\t" +m2);
	}
}

class StudentInfo
{
	public static void main(String args[])
	{
		int i;
		Student[] obj;
		obj=new Student[2];

		for(i=0;i<2;i++)
		{
			obj[i]=new Student();
		}
		for(i=0;i<2;i++)
		{
			obj[i].getData();	
		}
		System.out.println("Roll No. \t Name \t Mark1\t Mark2");

		for(i=0;i<2;i++)
		{
			obj[i].putData();
		}
	}
 }