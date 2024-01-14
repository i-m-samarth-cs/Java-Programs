import java.util.*;
class Rectangle extends Thread
{
    public void run()
    {
        r.area();
        r.perimeter();
    }
}
class Thread 
{
    public static void main(String args[])
    {
        int length,breadth;
        float ar,peri;
        void area()
        {
            ar=length*breadth;
            System.out.println("Area ="+ar);
        }
        void perimeter()
        {
            peri=2*(length+breadth);
            System.out.println("Perimeter ="+peri);
        }
        Rectangle r=new Rectangle();
        r.start();
    }
}