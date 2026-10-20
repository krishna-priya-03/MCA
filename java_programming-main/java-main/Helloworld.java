import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="Helloworld" width=200 height=60>
</applet>
*/
@SuppressWarnings("removal")
public class Helloworld extends Applet {
    public void paint(Graphics g)
     {
        g.drawString("Hello World", 50, 50);
    }
}