import java.io.*;

class CommandLine
{
   public static void main(String arg[])
   {
	int count,i;
	String str;
	
	count=arg.length;
	System.out.println("Number of Arguments"+count);
	
	for(i=0;i<count;i++)
	{
	   str=arg[i];
	   System.out.println(" "+i+":"+str);
	}
   }
}