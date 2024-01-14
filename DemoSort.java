import java.util.*;
class DemoSort
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i;
        Scanner s=new Scanner(System.in);

        for(i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}