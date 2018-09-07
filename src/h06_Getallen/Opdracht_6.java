package h06_Getallen;

import java.applet.Applet;
import java.awt.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Opdracht_6 extends Applet {
    private int aPer;
    public void init(){
        int total = 113;
        int per = 4;
        aPer = total / per;

    }
    public void paint(Graphics g){

        g.setColor(Color.black);
        int startX = 10, startY = 15;

        //region Opdracht 6.1
        g.drawString("Jan €" + aPer, startX,startY);
        g.drawString("Ali €" + aPer, startX,startY+15);
        g.drawString("Jeannette €" + aPer, startX,startY+30);
        g.drawString("Dawid €" + aPer, startX,startY+45);
        //endregion

        startY = startY + 65;
        g.drawLine(startX, startY-15, startX+200, startY-15);

        //region Opdracht 6.2
        int sec = 1, min, hh, day, year;
        min = sec * 60;
        hh = min *60;
        day = hh * 24;
        year = day*365;
        g.drawString("Aantal seconden in een jaar: " + year, startX, startY);
        //endregion

        startY = startY + 25;
        g.drawLine(startX, startY-15, startX+200, startY-15);

        //region Opdracht 6.3
        g.drawString("-(1 + 2) = " + -(1+2), startX, startY);
        //endregion

        startY = startY + 25;
        g.drawLine(startX, startY-15, startX+200, startY-15);

        //region Praktijkopdracht 6
        double gemiddeld = (5.9+6.3+6.9)/3;
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.DOWN);
        g.drawString("Het gemiddelde is: " + df.format(gemiddeld), startX, startY);

        /*
        String XD = df.format(gemiddeld);
        double XD2 = Double.parseDouble(XD);
        System.out.print(XD2);
        */
        //endregion

    }
}
