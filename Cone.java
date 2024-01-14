import java.applet.*;
import java.awt.*;

public class Cone extends Applet
{
	public void paint(Graphics g)
	{
		Font font=new Font("Serif",Font.PLAIN,26);
		g.setFont(font);
		g.drawOval(80,280,320,100);
		g.drawLine(240,50,82,320);
		g.drawLine(240,50,398,320);
		g.drawLine(240,330,398,330);
		g.drawLine(240,50,240,330);
		g.drawString("Radius",260,360);
		g.drawString("Height",246,225);
		g.drawString("Slant Height",340,210);
		g.drawString("CONE",220,420);
	}
}

/* <applet code=Cone width=400 height=400 ></applet> */