package h13_Methodes;

import daawson.main.Helper;

import java.applet.Applet;
import java.awt.*;

@SuppressWarnings("Duplicates")
public class Opdracht_132 extends Applet {
    int wallHeight = 8;
    int wallWidth = 5;
    int brickWidth = 50;
    int brickHeight = 25;

    public void init(){}
    public void paint(Graphics g){
        for(int x = 0; x < wallWidth; x++){
            for(int y = 0; y < wallHeight; y++){
                if(y % 2 == 0)
                    Helper.drawWall(g, Color.red,50+x*brickWidth, 50+y*brickHeight, brickWidth, brickHeight);
                else
                    Helper.drawWall(g, Color.red,25+x*brickWidth, 50+y*brickHeight, brickWidth, brickHeight);
            }
        }
    }


}
