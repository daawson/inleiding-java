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
        JApplet opd43 = new opdracht43();
        JApplet opd44 = new opdracht44();
        JApplet opd45 = new opdracht45();
        JApplet opd46 = new opdracht46();
        JApplet opd47 = new opdracht47();
        JApplet opdfin = new opdrachtFinaal();
        applets = new JApplet[]{opd2,opd22, opd41, opd42,opd43,opd44, opd45, opd46, opd47, opdfin};
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
