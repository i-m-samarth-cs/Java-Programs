import java.util.*;
class ArrofObj
{
  int a;
  Scanner s=new Scanner(System.in);
  void accept()
  {
     System.out.println("Enter any Number:");
     a=s.nextInt(); 
  }
  void display()
  {
     System.out.println("A="+a);
  }
}
class ArrayObj
{
  public static void main(String args[])
  {
     int i=0;
     ArrofObj obj[]=new ArrofObj[5];
     for(i=0;i<5;i++)
     {
        obj[i]=new ArrofObj();
     }
     for(i=0;i<5;i++)
     {
       obj[i].accept();
       obj[i].display();
     }
   }
}