import java.util.*;

class DemoString1
{
	public static void main(String args[])
	{
		String str="Pooja";
		String str1="Click Computers";
		String str2="feet";
		
		System.out.println("At which index position is e: "+str1.indexOf('e'));
		System.out.println("Last index position of C: " +str1.lastIndexOf('C'));
		System.out.println("Hello ".concat(str));
		System.out.println("Compare string "+str2.compareTo(str));
		System.out.println("To Lower Case " +str.toLowerCase());
		System.out.println("To upper Case " +str.toUpperCase());
		System.out.println("Replace e to o " +str2.replace('e','o'));
		System.out.println(str1.contains("Comp"));
		System.out.println("   Hello".trim());

	}
}