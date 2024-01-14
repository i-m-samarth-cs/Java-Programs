import java.util.*;
class Student
{
   Scanner s=new Scanner(System.in);
   String name;
   int rollno;
   float percentage;
   void accept()
   {
     System.out.println("Enter Name,Roll no and Percentage");
     name=s.next();
     rollno=s.nextInt();
     percentage=s.nextFloat();
   }
   void display()
   {
     System.out.println("Name "+name);
     System.out.println("Roll no "+rollno);
     System.out.println("Percentage "+percentage);
   }
   public static void main(String args[])
   {
      Student1 S[]=new Student[5];
      int i=0;
      for(i=0;i<5;i++)
      {
         S[i].accept();
	     S[i].display();
      }
   }
}