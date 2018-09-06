package h10_Beslissingen;

import java.applet.*;
import java.awt.*;

public class Opdracht_101 extends Applet {
    private int largest = 0, lowest = 0, current;
    private boolean firstnum = true;
    public void init(){
        TextField input = new TextField();
        input.addActionListener(e-> UpdateValues(Integer.parseInt(input.getText())));
        add(input);
    }
    private void UpdateValues(int num){
        if(!firstnum) {
            current = num;
            if (num > largest)
                largest = num;
            else if (num < lowest)
                lowest = num;
            repaint();
        }
        else{
            largest = num;
            lowest = num;
            firstnum = false;
            repaint();
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Your number: "+current+" Largest number: "+largest+ " Lowest number: "+lowest, 60,60);
    }
}
