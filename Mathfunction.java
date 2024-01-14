import java.math.*;
import java.util.*;

class Mathfunction
{
	public static void main(String args[])
    {
	   int a,b,ch;
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter any 2 Numbers");
	   a=s.nextInt();
	   b=s.nextInt();
       
	   System.out.println("*****MENU*****");
	   System.out.println("MATHEMATICAL FUNCTIONS");
	   System.out.println("1.Min");
	   System.out.println("2.Max");
	   System.out.println("3.Square Root");
	   System.out.println("4.Power(Raise to)");
	   System.out.println("5.Round off");

	   System.out.println("Enter Choice:");
	   ch=s.nextInt();

	   switch(ch)
	   {
			case 1:
				   System.out.println("Small Number:"+Math.min(a,b));
				   break;
		   case 2:
				   System.out.println("Large Number:"+Math.max(a,b));
				   break;
		   case 3:
				   System.out.println("Square Root of 1st Number:"+Math.sqrt(a));
				   System.out.println("Square Root of 2nd Number:"+Math.sqrt(b));
				   break;
		   case 4:
				   System.out.println("Power:"+Math.pow(a,b));
				   break;
	       case 5:
				   System.out.println("Rounded of 1st Number:"+Math.round(a));
				   System.out.println("Rounded of 2nd Number:"+Math.round(b));
			       break;
		   default:
					System.out.println("Invalid Choice");
					break;
	}
}
}

		