package h04_Tekenen;

import daawson.main.Helper;

import java.applet.*;
import java.awt.*;

public class Opdracht_41 extends Applet {
    public void init(){}
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawPolygon(Helper.createTriangle(150,150, 100, false));
    }
}
