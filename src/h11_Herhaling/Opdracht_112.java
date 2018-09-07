package h11_Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_112 extends Applet {
    public void init(){

    }
    public void paint(Graphics g){
        for(int i = 20; i>=10; i--){
            g.drawString(""+i, 450-(i*17), 60);
        }
    }
}
