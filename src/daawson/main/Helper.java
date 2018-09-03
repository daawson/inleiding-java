package daawson.main;

import java.awt.*;
import java.awt.geom.Point2D;

public class Helper {

    //maakt een driehoek in de origin x/y
    public static Polygon createTriangle(float x, float y, float side, boolean invert) {
        float xOff = side / 2f;
        float yOff = (float) (xOff * Math.sqrt(3));

        float r1 = 1f / 3f;
        float r2 = 2f / 3f;

        if (invert) { yOff *= -1; }

        Point2D.Float top   = new Point2D.Float(x,        y - (yOff * r2));
        Point2D.Float left  = new Point2D.Float(x - xOff, y + (yOff * r1));
        Point2D.Float right = new Point2D.Float(x + xOff, y + (yOff * r1));

        int xCoords[] = { (int) top.x, (int) left.x, (int) right.x, (int) top.x };
        int yCoords[] = { (int) top.y, (int) left.y, (int) right.y, (int) top.y };

        return new Polygon(xCoords, yCoords, xCoords.length);
    }
    //setBackground
    public static void setCBackground(Graphics g, Color c){
        g.setColor(c);
        g.fillRect(0, 0, 1920, 1080);
    }

}
