package h04_Tekenen;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_46 extends Applet {
    public void init(){}
    public void paint(Graphics g){

        int startX = 300/2-60, startY = 5;
        g.setColor(Color.black);
        g.fillRect(startX,startY, 100, 250);

        g.setColor(Color.GREEN);
        g.fillArc(startX+25,startY+25, 50,50, 90, 360);

        g.setColor(Color.YELLOW);
        g.fillArc(startX+25,startY+25*4, 50,50, 90, 360);

        g.setColor(Color.RED);
        g.fillArc(startX+25,startY+25*7, 50,50, 90, 360);
    }
}
