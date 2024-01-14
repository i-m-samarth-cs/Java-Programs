import java.util.*;
import java.io.*;
class Demodd
{
   public static void main(String args[])
   {
	   int num,i,sum=0;
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter Range:");
	   num=s.nextInt();
  	   for(i=0;i<=num;i++)
	   {
		  if(i%2!=0)
		  {
			System.out.println(" "+i);
			sum=sum+i;
		  }
		  else
		  {
          
		  }
	   }
		  System.out.println("Addition of all odd Number is:"+sum);
    }
  
  }
	