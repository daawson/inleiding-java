package daawson.main;

import javax.swing.*;
import java.awt.*;

import opdracht.*;

public class AppletMaster extends JApplet{
    private int index = 0;
    private JApplet[] applets;
    public void init(){
        getContentPane().setBackground(Color.white);
        setSize(300,300);

        JApplet opd2 = new opdracht2();
        JApplet opd22 = new opdracht22();
        JApplet opd41 = new opdracht41();
        JApplet opd42 = new opdracht42();
        applets = new JApplet[]{opd2,opd22, opd41, opd42};
        setView(index);

    }
    public void paint(Graphics g){
        Dimension d = getSize();
        g.setColor(Color.white);
        g.fillRect(0, 0, d.width, d.height);
        applets[index].paint(g);
    }

    void setView(int indx){
        removeAll();
        index = indx;
        applets[index].init();
        repaint();
    }
}
