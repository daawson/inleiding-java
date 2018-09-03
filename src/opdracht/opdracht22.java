package opdracht;

import javax.swing.*;
import java.awt.*;

public class opdracht22 extends JApplet {
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
