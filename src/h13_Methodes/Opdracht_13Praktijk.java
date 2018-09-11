package h13_Methodes;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_13Praktijk extends Applet {
    public void init(){}
    public void paint(Graphics g){
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 5; x++){
                if(y % 2 == 0)
                    drawTree(g, 50+x*50,25+y*50, 100);
                else
                    drawTree(g, 25+x*50,25+y*50, 100);
            }
        }

    }

    private void drawTree(Graphics g, int x, int y, int height){
        g.setColor(Color.black);
        g.fillRect(x+height/6, y+height/2, 15, height/2);
        g.setColor(Color.green);
        g.fillOval(x,y+10, height/2, height/2);

    }
}
