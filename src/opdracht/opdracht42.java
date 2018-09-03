package opdracht;

import daawson.main.Helper;

import javax.swing.*;
import java.awt.*;

public class opdracht42 extends JApplet {
    public void init(){}
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(100,100, 100,100);
        g.drawPolygon(Helper.createTriangle(150,72, 100, false));

        g.drawRect(110, 130, 40, 70);
        g.drawRect(160, 160, 25,25);

    }

}
