package h11_Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_11Praktijk_2 extends Applet {
    private int cNum = 1;
    public void init(){
        Button bOK = new Button("OK");

        bOK.addActionListener(e->{
            if(cNum == 10) cNum = 0;
            cNum += 1;
            repaint();
        });

        add(bOK);
    }
    public void paint(Graphics g) {
        for(int i = 1; i < 10; i++){
            g.drawString(i + " * " + cNum + " = "+cNum*i, 25, 25+i*19);
        }
    }
}
