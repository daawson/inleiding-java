package h04_Tekenen;

import daawson.main.Helper;

import java.applet.*;
import java.awt.*;

public class Opdracht_42 extends Applet {
    public void init(){}
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(100,100, 100,100);
        g.drawPolygon(Helper.createTriangle(150,72, 100, false));

        g.drawRect(110, 130, 40, 70);
        g.drawRect(160, 160, 25,25);

    }

}
