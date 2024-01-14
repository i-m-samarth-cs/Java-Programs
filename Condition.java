import java.util.*;
import java.io.*;

class Condition
{
   public static void main(String ars[])
   {
	   int a,b,c;
       Scanner S1=new Scanner(System.in);
       System.out.println("Enter 2 Number:");
	   a=S1.nextInt();
       b=S1.nextInt();
       c=(a>b)?a:b;
	   System.out.println("Greatest Number is:"+c);
    }
}
       