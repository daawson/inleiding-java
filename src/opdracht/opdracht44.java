package opdracht;

import javax.swing.*;
import java.awt.*;

public class opdracht44 extends JApplet {
    public void init(){}
    public void paint(Graphics g){
        int valerieKg = 40, jeroenKg = 100, hanskG = 80;

        int startX = 40, startY = 15;

        int max = startY+160, margin = 10, cWidth = 45;

        g.setColor(Color.black);
        g.drawLine(startX, startY, startX, startY+max);
        g.drawLine(startX, startY+max, startX+(4*margin+3*cWidth), startY+max);

        //Valerie
        g.setColor(Color.black);
        g.drawString("Valerie", startX+margin, startY+max+15);
        g.setColor(Color.pink);
        g.fillRect(startX+margin, startY+max-valerieKg, cWidth, valerieKg);

        //Jeroen
        g.setColor(Color.black);
        g.drawString("Jeroen", startX+margin*2+cWidth, startY+max+15);
        g.setColor(Color.blue);
        g.fillRect(startX+margin*2+cWidth, startY+max-jeroenKg, cWidth, jeroenKg);

        //Hans
        g.setColor(Color.black);
        g.drawString("Hans", startX+margin*3+cWidth*2, startY+max+15);
        g.setColor(Color.red);
        g.fillRect(startX+margin*3+cWidth*2, startY+max-hanskG, cWidth, hanskG);

        for(int i = -(max/20); i<0; i++){
            g.setColor(Color.gray);
            g.drawLine(startX, (startY+-i*20)-10, startX+(4*margin+3*cWidth), (startY+-i*20)-10);
            g.setColor(Color.black);
            g.drawString(""+ -(i*20), startX-25, (max+startY+i*20)+5);
        }
    }
}
