class Point
{
  int m_x,m_y;
  Point(int x,int y)
  {
    m_x=x;
	m_y=y;
  }
  public static void main(String args[])
  {
    Point p=new Point(2,3);
    System.out.println("X "+p.m_x);
    System.out.println("Y "+p.m_y);
    System.out.println("X "+p.m_x);
    System.out.println("Y "+p.m_y);
  }
}