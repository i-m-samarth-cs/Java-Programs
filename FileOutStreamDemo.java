import java.io.*;
class FileInputOutput
{
 public static void main(String args[]) 
 {
 FileOutputStream fout;
 FileInputStream fin;
 byte b[]={'J','a','v','a',' 
','P','r','o','g','r','a','m','m','i','n', 'g'};
 try
 {
fout = new FileOutputStream("Java Stream.txt");
fout.write(b);
System.out.println("\nFile Created Successfully");
fout.close();
fin = new FileInputStream("Java Stream.txt");
byte B[] = new byte[ fin.available() ];
fin.read(B);
System.out.println("\n\n Reading File Java 
Stream.txt : \n");
for(int i =0 ; i<B.length ; i++)
{
 System.out.print((char)B[i]);