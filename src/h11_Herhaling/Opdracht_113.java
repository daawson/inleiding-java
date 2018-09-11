package h11_Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_113 extends Applet {
    private String finaal = "";

    public void init(){

        int count = 15;
        int a = 0, b = 1, c;
        finaal = finaal.concat(a +","+b);

        for(int i = 2; i < count; i++) {
            c = a+b;
            finaal = finaal.concat(","+c);
            a=b;
            b=c;
        }

    }
    public void paint(Graphics g){
        g.drawString(finaal, 60,60);
    }
}
