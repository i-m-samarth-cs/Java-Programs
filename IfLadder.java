import java.io.*;
import java.util.*;
class IfLadder
{
    public static void main(String args[])throws IOException
    {
        int Java,c,oop,total,avg;
        Scanner br=new Scanner(System.in);
        
        System.out.println("Enter the marks of java");
        Java=br.nextInt();

        System.out.println("Enter the marks of C");
        c =br.nextInt();

        System.out.println("Enter the marks of oop");
        oop=br.nextInt();

        total=Java+c+oop;
        avg=total/3;
        System.out.println("Total Marks :" +total);
        System.out.println("Average :" +avg);

        if(Java>=40 && c>=40 && oop >=40)
        {
            if(avg >=80)
                System.out.println(" Grade : A");
            else if(avg>=60)
                System.out.println("Grade : B");
            else if(avg>=40)
                System.out.println(" Grade : C");
        }        
        else    
            System.out.println(" Fail...!");
    }
}