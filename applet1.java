import java.applet.*;
import java.awt.*;

/*
  <applet code="applet1" width=1000 height=2000>
  </applet>
*/
public class applet1 extends Applet
{
  public void init()
  {
     setBackground(Color.red);
     setForeground(Color.yellow);
  }
  public void paint(Graphics g)
  {
    g.drawString("My name is Samarth",500,500);
  }
}