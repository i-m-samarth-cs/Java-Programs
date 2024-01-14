import java.util.*;

class Palindrome
{
   public static void main(String args[])
   {
	  int num,temp,rev=0,rem=0;
      System.out.println("Enter a number:");
	  Scanner s=new Scanner(System.in);
 	  num=s.nextInt();
	  temp=num;

	  while(num!=0)
	  {
	    rem=num%10;
	    rev=(rev*10)+rem;
	    num=num/10;
	  }
	  if(temp==rev)
	  {
		System.out.println(temp+"is Palindrome Number");
      }
	  else
	  {
		  System.out.println(temp+"is not an Armstrong Number");
      }

  }
}