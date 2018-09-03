package opdracht;

import daawson.main.Helper;

import javax.swing.*;
import java.awt.*;

public class opdracht41 extends JApplet {
    public void init(){}
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawPolygon(Helper.createTriangle(150,150, 100, false));
    }
}
