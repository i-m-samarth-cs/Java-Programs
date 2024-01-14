import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Animation2 extends Applet
{
	public void paint(Graphics g)
	{
		int a=100,b=100,c=10,d=10;
		
		g.setColor(Color.blue);
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
			
			g.draw Rect(a,b,c,d);
			a-=5;
			b-=5;
			c+=10;
			d+=10;
		
		}
	}
}
/*<applet code="Animation2" width=400 height=400>
</applet> */