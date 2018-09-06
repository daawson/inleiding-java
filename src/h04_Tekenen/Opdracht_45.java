package h04_Tekenen;

import daawson.main.Helper;

import java.applet.*;
import java.awt.*;

public class Opdracht_45 extends Applet {
    public void init(){}
    public void paint(Graphics g){
        Helper.setCBackground(g, Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(50,50, 120,100, 110, 360);
    }
}
