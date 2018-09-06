package h04_Tekenen;

import java.applet.*;
import java.awt.*;

public class Opdracht_43 extends Applet {
    public void init(){}
    public void paint(Graphics g){
        int startX = 45;
        int startY = 45;
        g.setColor(Color.black);
        g.fillRect(startX,startY,20, 200);
        g.setColor(Color.red);
        g.fillRect(startX+20,startY, 150,33);
        g.setColor(Color.white);
        g.fillRect(startX+20,startY+33, 150,66);
        g.setColor(Color.blue);
        g.fillRect(startX+20,startY+66,150,33);
        g.setColor(Color.black);
        g.drawRect(startX+20,startY,150,99);
    }
}
