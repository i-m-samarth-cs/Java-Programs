import java.awt.*;
import java.applet.*;

public class Name extends Applet
{
  String str=null,str1=null;

  int x[]={100,150,50};
  int y[]={100,200,200};
  public void paint(Graphics g)
  {
    g.setColor(Color.cyan);
    g.fillPolygon(x,y,3);
     
}
}
/*
  <Applet code="Name" width=1000 height=1000>
  </Applet>
*/