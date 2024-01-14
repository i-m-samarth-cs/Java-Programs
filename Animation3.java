import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Animation3 extends Applet
{
	public void paint(Graphics g)
	{
		int a=100,b=100,c=100,d=200;
		g.setColor(Color.red);
		
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{}
				g.drawLine(a,b,c,d);
				c+=30;
				d=30;
		}
	}
}

/*<applet code=Animation3 width=400 height=400>
</applet> */