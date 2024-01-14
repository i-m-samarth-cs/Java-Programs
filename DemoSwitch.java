import java.util.*;
class DemoSwitch
{
	public static void main(String args[])
	{
		int a=0,b=0,r,ch;
		r=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your choice :");
		ch=s.nextInt();		
		
		if(ch>=1 && ch<=4)
		{			
			System.out.println("Enter first number :");
			a=s.nextInt();

			System.out.println("Enter Second number :");
			b=s.nextInt();
		}
		
		switch(ch)
		{
			case 1:
				r=a+b;
				System.out.println("Addition of" +a+ " and " +b+ " is "+r);
				break;

			case 2:
				r=a-b;
				System.out.println("Subtraction of" +a+ " and " +b+ " is "+r);
				break;
			case 3:
				r=a*b;
				System.out.println("Multiplication of" +a+ " and " +b+ " is "+r);
				break;
			case 4:
				r=a/b;
				System.out.println("Division of" +a+ " and " +b+ " is "+r);
				break;

			default:
				System.out.println("Invalid Choice");
				break;

		}
	}
}