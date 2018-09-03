package opdracht;

import javax.swing.*;
import java.awt.*;

public class opdracht46 extends JApplet {
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
