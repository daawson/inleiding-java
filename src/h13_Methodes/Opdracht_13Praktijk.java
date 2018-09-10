package h13_Methodes;

import daawson.main.Helper;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_13Praktijk extends Applet {
    public void init(){}
    public void paint(Graphics g){
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 5; x++){
                if(y % 2 == 0)
                    Helper.drawTree(g, 50+x*50,25+y*50, 100);
                else
                    Helper.drawTree(g, 25+x*50,25+y*50, 100);
            }
        }

    }
}
