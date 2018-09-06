package h02_JavaApplet;


import daawson.main.Helper;

import java.applet.*;
import java.awt.*;

public class Opdracht_20 extends Applet {
   public void init(){}

   public void paint(Graphics g){
       Helper.setCBackground(g, Color.blue);
       g.setColor(Color.yellow);
       g.drawString("Dawid", 50,50);
   }
}