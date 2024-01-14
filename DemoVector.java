import java.io.*;
import java.util.*;
class DemoVector
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Vector v=new Vector(5);
		
		System.out.println("Current size " +v.size());
	
		v.addElement(new Integer(10));
		v.addElement(new Integer(20));
		v.addElement(new Float(4.5));
		v.addElement(new Float(10.55));
		v.addElement("ABC");
		v.addElement("Xyz");
		
		System.out.println("After adding elements size "+v.size());
		System.out.println("First : "+v.firstElement());
		System.out.println("Last : "+v.lastElement());
		System.out.println("All elements " +v);
		
		System.out.println("Enter the element to be removed: ");
		String ele=s.next();
		v.removeElement(ele);
		System.out.println("After Removing :" +v);	

	}
}