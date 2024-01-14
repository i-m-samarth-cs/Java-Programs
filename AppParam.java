import java.applet.*;
import java.awt.*;

public class AppParam extends Applet
{
	String name, msg;
	public void init()
	{
		name=getParameter("Pname");
	}
	public void paint(Graphics g)
	{
		msg="Hello" +name;
		g.drawString(msg,200,300);
	}
}


/*
<applet code="AppParam" width=200 height=100>
<param name="Pname" value="Kunal"/>
</applet>
*/




