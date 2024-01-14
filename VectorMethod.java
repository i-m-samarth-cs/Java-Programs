import java.util.*;
import java.io.*;

class VectorMethod
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector(20);
		System.out.println("Capacity of Current vector"+v.capacity());
			
		Vector v1=new Vector();
		System.out.println("Capacity of Default Vector"+v1.capacity());
			
		v1.addElement(10);
		v1.addElement(20.3);
		System.out.println("Size of Default Vector: "+v1.size()+"\n Size of Parameterised Vector"+v.size()); 
	
		v.add(2);
		
		System.out.println("To Fetch the element using get() method "+v.get(0));
		v1.removeAllElements();
		System.out.println("After removing ele Size of Default Vector: "+v1.size());
		System.out.println("Enter the Element in vector v1");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the ele of "+i);
			int no=sc.nextInt();
			v1.addElement(no);
		}
		v1.addElement(45);
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
		
		System.out.println("Return the ele at 2 index "+v1.elementAt(2));
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add("abc");
		System.out.println("Before appending values in Vector");
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
		v1.addAll(al);
		System.out.println("After appending array list element");
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
	}
}