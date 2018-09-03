package opdracht;


import javax.swing.*;
import java.awt.*;

public class opdracht2 extends JApplet{
   public void init(){
       setBackground(Color.blue);
   }
   public void paint(Graphics g){
       g.setColor(Color.yellow);
       g.drawString("Dawid", 50,50);
   }
}