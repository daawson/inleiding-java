package h11_Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_114 extends Applet {
    public void paint(Graphics g){
        for(int i = 1; i <= 10; i++){
            g.drawString(i+" * 3 = "+ i*3, 50, 35+i*15);
        }
    }
}
