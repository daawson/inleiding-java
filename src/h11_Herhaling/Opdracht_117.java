package h11_Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_117 extends Applet {
    public void init(){}
    public void paint(Graphics g){
        for(int i = 0; i < 50; i++){
            int startX = 200;
            int size = 4;
            g.drawOval(startX -i*size, startX -i*size, 25+i*(size*2),25+i*(size*2));
        }
    }
}
