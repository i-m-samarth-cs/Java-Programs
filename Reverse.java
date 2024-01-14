import java.util.*;

class Reverse
{
   public static void main(String args[])
   {
	  int num,rev=0,rem=0;
      System.out.println("Enter a number:");
	  Scanner s=new Scanner(System.in);
 	  num=s.nextInt();

	  while(num!=0)
	  {
	    rem=num%10;
	    rev=(rev*10)+rem;
	    num=num/10;
	  }
		System.out.println("Reverse is:"+rev);
}
}