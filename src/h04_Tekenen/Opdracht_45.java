package h04_Tekenen;

import java.applet.*;
import java.awt.*;

public class Opdracht_45 extends Applet {
    public void init(){
        setBackground(Color.blue);
    }
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillArc(50,50, 120,100, 110, 360);
    }
}
