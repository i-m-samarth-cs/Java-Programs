import java.io.*;
class Copy
{
public static void main(String args[]) throws IOException
{
FileInputStream in = null ;
FileOutputStream out = null ;
 int c;
try
{
 in = new FileInputStream("input.txt");
 out = new FileOutputStream("output.txt");
 
 while((c=in.read())!= -1)
 {
 out.write(c);
 }
 in.close();
 out.close();
 System.out.println("\n File is copied Successful");
}
catch(Exception p)
{}
 }
}