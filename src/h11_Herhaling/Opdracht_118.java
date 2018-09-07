package h11_Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_118 extends Applet {
    public void init(){}
    public void paint(Graphics g){
        for(int i = 0; i < 100; i++){
            int startX = 50;
            int size = 5;
            g.drawOval(startX, startX, 25+i*size,25+i*size);
        }
    }
}
