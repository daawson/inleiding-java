package h11_Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_116 extends Applet {
    public void init(){}
    public void paint(Graphics g){
        for(int i = 0; i < 5; i++){
            int startX = 50;
            g.drawOval(startX -i*10, startX -i*10, 25+i*20,25+i*20);
        }
    }
}
