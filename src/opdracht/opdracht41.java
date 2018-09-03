package opdracht;

import daawson.main.Helper;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class opdracht41 extends JApplet {
    public void init(){}
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawPolygon(Helper.createTriangle(100,100, 100, false));
    }
}
