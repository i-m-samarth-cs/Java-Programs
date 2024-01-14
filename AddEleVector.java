
import java.io.*;
import java.util.*;
class AddEleVector
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Element");
		int no=sc.nextInt();
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the element" +i+"th Position");
			int ele=sc.nextInt();
			v.addElement(ele);
		}
		v.addElement(new Float(10.00));
		v.addElement(new Double(3.14));
		v.addElement(new String("Pooja"));
		System.out.println( "Size of vector " +v.size());
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}

		v.removeElement(3.14);
		System.out.println("Vector after removing element");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
	}
}