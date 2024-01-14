import java.applet.*;
import java.awt.*;
/*
  <applet code="appfont" width=300 height=300>
  </applet>
*/
public class appfont extends Applet
{
  int fsize;
  String fname;
  Font f;
  public void init()
  {
    fsize=30;
    fname="Times New Roman";
    f=new Font(fname,Font.BOLD,fsize);
    setBackground(Color.cyan);
  }
  public void paint(Graphics g)
  {
     g.drawString("Hello World",10,50);
     g.setFont(f);
     g.drawString("Hello Samarth",50,150);
  }
}