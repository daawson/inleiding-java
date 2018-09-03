package opdracht;


import daawson.main.Helper;

import javax.swing.*;
import java.awt.*;

public class opdracht2 extends JApplet{
   public void init(){}
   public void paint(Graphics g){
       Helper.setCBackground(g, Color.blue);
       g.setColor(Color.yellow);
       g.drawString("Dawid", 50,50);
   }
}