package h13_Methodes;

import java.applet.Applet;
import java.awt.*;

@SuppressWarnings("Duplicates")
public class Opdracht_133 extends Applet {

    private boolean drawMeABrick = false;
    private boolean drawMeABeton = false;

    private int wallHeight = 8;
    private int wallWidth = 5;

    public void init(){
        Button bBrick = new Button("Brick Wall");
        bBrick.addActionListener(e->{
            drawMeABrick = true;
            drawMeABeton = false;
            repaint();
        });

        Button bBeton = new Button("Beton Wall");
        bBeton.addActionListener(e->{
            drawMeABrick = false;
            drawMeABeton = true;
            repaint();
        });

        add(bBrick);
        add(bBeton);
    }
    public void paint(Graphics g){
        if(drawMeABrick){
            for(int x = 0; x < wallWidth*2; x++){
                for(int y = 0; y < wallHeight*2; y++){
                    if(y % 2 == 0)
                        drawWall(g, Color.red, 30+x*30, 50+y*15, 30, 15);
                    else
                        drawWall(g, Color.red, 15+x*30, 50+y*15, 30, 15);
                }
            }
        }
        else if(drawMeABeton){
            for(int x = 0; x < wallWidth; x++){
                for(int y = 0; y < wallHeight; y++){
                    if(y % 2 == 0)
                        drawWall(g, Color.gray, 50+x*50, 50+y*25, 50, 25);
                    else
                        drawWall(g, Color.gray, 25+x*50, 50+y*25, 50, 25);
                }
            }
        }
    }

    private void drawWall(Graphics g, Color c, int x, int y, int w, int h){
        g.setColor(c);
        g.fillRect(x,y,w,h);
        g.setColor(Color.black);
        g.drawRect(x,y,w,h);
    }


}
