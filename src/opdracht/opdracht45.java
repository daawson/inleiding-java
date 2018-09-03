package opdracht;

import daawson.main.Helper;

import javax.swing.*;
import java.awt.*;

public class opdracht45 extends JApplet {
    public void init(){}
    public void paint(Graphics g){
        Helper.setCBackground(g, Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(50,50, 120,100, 110, 360);
    }
}
