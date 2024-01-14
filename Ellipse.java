import java.applet.*;
import java.awt.*;

public class Ellipse extends Applet
{
	public void paint(Graphics g)
	{
		int a=100,b=75,c=100,d=50;

		g.setColor(Color.blue);

		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException ex){}
			g.drawOval(a,b,c,d);
			a=a-10;
			b=b-10;
			c=c+20;
			d=d+20;
		}
	}
}

/*<applet code="Ellipse" width=400 height=400> </applet> */