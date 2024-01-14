import java.io.*;
class Logical1
{
  public static void main(String args[])throws IOException
  {
     String a,b,c;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter any Number:");
     a=s.nextInt();
System.out.println("Enter any Number:");
     b=s.nextInt(); 
System.out.println("Enter any Number:");
     c=br.nextInt(); 
     if(a>b && a>c)
     {
	     System.out.println("A is Greatest");
     } 
     else if(b>a && b>c)
     {
	     System.out.println("B is Greatest");
     }  
     else
	 {
		 System.out.println("C is Greatest");
     }
  }
}  
    