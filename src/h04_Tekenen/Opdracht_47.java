package h04_Tekenen;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_47 extends Applet {
    public void init(){}
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(50,50, 100,100);

        g.setColor(Color.black);
        g.fillArc(55,55, 25,25, 90, 360);

        g.setColor(Color.black);
        g.fillArc(120,55, 25,25, 90, 360);

        g.setColor(Color.black);
        g.fillArc(55,120, 25,25, 90, 360);

        g.setColor(Color.black);
        g.fillArc(120,120, 25,25, 90, 360);

    }
}
