import java.util.*;
class DemoArray
{
	public static void main(String args[])
	{
		int []arr;  		//array declaration
		arr=new int[5];
		int i,add=0;

		System.out.println("Enter 5 number ");
		Scanner s=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			arr[i]=s.nextInt();
			add=add+arr[i];
		}
		for(i=0;i<5;i++)
		{
			System.out.println("Arr[" +i+ "]=" +arr[i]);
		}
		System.out.println("Addition is  "+add);
	}
}