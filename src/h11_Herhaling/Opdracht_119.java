package h11_Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_119 extends Applet {
    int cellSize = 32;
    int gridSize = 8;
    public void init(){}

    public void paint(Graphics g) {

        for(int x = 0; x < gridSize; x++){
            for(int y = 0; y < gridSize; y++){
                if(y % 2 == 0 && x % 2 == 0) g.setColor(Color.black);
                else if(y % 2 != 0 && x % 2 == 0) g.setColor(Color.white);
                else if(y % 2 != 0 && x % 2 != 0) g.setColor(Color.black);
                else if(y % 2 == 0 && x % 2 != 0) g.setColor(Color.white);

                g.fillRect(25+x*cellSize, 25+y*cellSize, cellSize,cellSize);
            }
        }
        g.setColor(Color.black);
        g.drawRect(25,25, gridSize*cellSize, gridSize*cellSize);
    }
}
