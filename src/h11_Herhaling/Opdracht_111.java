package h11_Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_111 extends Applet {
    public void init(){}
    public void paint(Graphics g){
        for(int i = 0; i < 10; i++){
            g.setColor(new Color(255,25*i,10*i));
            g.drawLine(50+15*i, 15, 50+15*i, 200);
        }
    }
}
