import java.applet.*;
import java.awt.*;
/*
  <applet code="line1" width=200 height=200>
  </applet>
*/
public class line1 extends Applet
{
  public void init()
  {
  setBackground(Color.cyan);
  setForeground(Color.red);
  }
 public void paint(Graphics g)
 {
   g.drawLine(100,100,200,300);
   g.drawLine(200,300,250,350);
 g.drawLine(200,200,250,350);
 g.drawLine(30,30,250,350);
 g.drawLine(240,200,250,350);
 }
}
