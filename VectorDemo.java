import java.util.*;
class VectorDemo
{
  public static void main(String args[])
  {
    int i=0;
    Vector v=new Vector();
    v.addElement(5);
    v.addElement(15);
    v.addElement(25);
    v.addElement(35);
    v.addElement(45);
    System.out.println("Before Adding");
    for( i=0;i<v.size();i++)
    {
       System.out.println(" "+v.get(i));
    }
    v.add(2,55);
    System.out.println("After Adding");
    for( i=0;i<v.size();i++)
    {
       System.out.println(" "+v.get(i));
    }
    v.removeElementAt(1);
    v.removeElementAt(4);
    System.out.println("\n\n Vector After Rmoving Element");
    for( i=0;i<v.size();i++)
    {
       System.out.println(" "+v.get(i));
    }
}
}
    
    