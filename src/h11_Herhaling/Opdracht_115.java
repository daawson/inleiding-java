package h11_Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_115 extends Applet {
    public void init(){}
    public void paint(Graphics g){
        for(int i = 0; i < 5; i++){
            g.drawRect(25+i*25, 25+25*i, 25,25);
        }
    }
}
