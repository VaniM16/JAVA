import java.applet.Applet;  
import java.awt.*;  
import java.awt.event.*;
public class AppletHouse extends Applet{  
 
public void paint(Graphics g){  

g.setColor(Color.black);
int xpoints[]={180,500,830,180};
int ypoints[]={250,150,250,250};

g.setColor(Color.darkGray);
g.drawPolygon(xpoints,ypoints,3);
g.fillPolygon(xpoints,ypoints,3);

g.setColor(Color.yellow);
g.drawRect(250,250,500,350);
g.fillRect(250,250,500,350);

g.setColor(Color.black);
g.drawRect(300,300,70,100);
g.drawRect(630,300,70,100);
g.setColor(Color.blue);
g.drawRect(450,300,100,300);
g.fillRect(450,300,100,300); 

}  
}

  

/*
<applet code="AppletHouse.class" width="500" height="300">
</applet>
*/