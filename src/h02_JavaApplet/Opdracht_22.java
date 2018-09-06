package h02_JavaApplet;

import java.applet.*;
import java.awt.*;

public class Opdracht_22 extends Applet {
    public void init(){
        setBackground(Color.white);
    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawString("Dawid", 50,50);
        g.setColor(Color.red);
        g.drawString("Kujawski", 50,65);
    }

}
