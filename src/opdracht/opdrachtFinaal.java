package opdracht;

import javax.swing.*;
import java.awt.*;

public class opdrachtFinaal extends JApplet {
    public void init(){}
    public void paint(Graphics g){

        // lijn
        g.setColor(Color.black);
        g.drawLine(15, 15, 125,15);
        g.drawString("Lijn", 65, 28);

        // rechthoek
        g.drawRect(15,40, 125,100);
        g.drawString("Rechthoek", 46,157);

        // afgeronde rechthoek
        g.drawRoundRect(15,170, 125,100,15,15);
        g.drawString("Afgeronde Rechthoek", 20,285);


    }
}
