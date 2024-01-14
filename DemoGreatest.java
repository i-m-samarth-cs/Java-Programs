import java.util.*;

class DemoGreatest
{
    public static void main(String args[])
    {
        int a,b,c;

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter three numbers");
        a=s1.nextInt();
        b=s1.nextInt();
        c=s1.nextInt();

        System.out.println("A :"+a+" B: "+b+ " C:"+c);

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is greater");
            }
            else    
            {
                System.out.println("C is Smaller");

            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("B is greater");
            }
            else
            {
                System.out.println("C is greater");
            }
        }
        
    }
}

/*
temp=a>b?a:b;

large=c>temp/c:temp */
/* if (a>=b && a>=c )
    else if(b>=a && b>=c)
    */