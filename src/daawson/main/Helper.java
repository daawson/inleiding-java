package daawson.main;

import java.awt.*;
import java.awt.geom.Point2D;

public class Helper {

    //region DOESNT MATTER
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
    //endregion

    public static void drawWall(Graphics g, Color c, int x, int y, int w, int h){
        g.setColor(c);
        g.fillRect(x,y,w,h);
        g.setColor(Color.black);
        g.drawRect(x,y,w,h);
    }

    public static int getClosest(int[] a, int x) {

        int low = 0;
        int high = a.length - 1;

        if (high < 0)
            throw new IllegalArgumentException("The array cannot be empty");

        while (low < high) {
            int mid = (low + high) / 2;
            assert(mid < high);
            int d1 = Math.abs(a[mid  ] - x);
            int d2 = Math.abs(a[mid+1] - x);
            if (d2 <= d1)
            {
                low = mid+1;
            }
            else
            {
                high = mid;
            }
        }
        return a[high];
    }

}
