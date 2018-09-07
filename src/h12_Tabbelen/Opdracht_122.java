package h12_Tabbelen;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_122 extends Applet {
    Button[] buttons = new Button[25];
    public void init() {
        for (int i = 0; i < buttons.length; i++){
            String in = "" + (i+1);
            buttons[i] = new Button(in);
            add(buttons[i]);
        }
    }
    public void paint(Graphics g){}
}
