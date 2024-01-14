import java.util.*;

class Demoifelse
{
    public static void main(String args[])
    {
    int marks;
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter Marks");
    marks=s1.nextInt();
    if(marks>40)
    {
        System.out.println("Pass..!");
    }
    else
    {
        System.out.println("Fail...!");
    }
    }
}