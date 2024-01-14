import java.applet.*;
import java.awt.*;
/*
 <applet code="app1" width=600 height=600>
 </applet>
*/
public class app1 extends Applet
{
  public void paint(Graphics g)
  {
    g.setColor(Color.red);
    g.drawOval(10,10,50,50);

	 g.setColor(Color.cyan);
     g.fillOval(10,10,50,50);

	 g.setColor(Color.green);
     g.drawOval(100,100,75,50);
     g.setColor(Color.black);
     g.fillOval(100,100,75,50);
}
}

