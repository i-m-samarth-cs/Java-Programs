
import java.util.*;

class Sumofall
{
   public static void main(String args[])
   {
   int num,sum=0,rem;
   System.out.println("Enter Number:");
   Scanner s=new Scanner(System.in);

   num=s.nextInt();
   while(num!=0)
   {
	  rem=num%10;
	  sum=sum+rem;
	  num=num/10;
   }
   /**
    Name:Samarth
    Subject: JPR
    Rollno:230
*/
   System.out.println("SUM="+sum);
 }
}