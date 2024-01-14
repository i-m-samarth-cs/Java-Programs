import java.util.*;

class DemoIf
{
    public static void main(String args[])
    {
        int age=20;

	System.out.println("Enter the age");
	Scanner s=new Scanner(System.in);
	age=s.nextInt();
        
        if(age>18)
            System.out.println("Age is above 18");
    }
}