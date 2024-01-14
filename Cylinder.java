import java.applet.*;
import java.awt.*;

public class Cylinder extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(50,60,100,50);
		g.drawLine(50,80,50,200);
		g.drawLine(150,80,150,200);
		g.drawOval(50,180,100,50);
	}
}

/*<applet code="Cylinder"  width=400 height=400></applet> */