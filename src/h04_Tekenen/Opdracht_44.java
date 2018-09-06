package h04_Tekenen;

import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class Opdracht_44 extends Applet {

    private static int valerieKg = 40, jeroenKg = 100, hanskG = 80;
    private Panel wrapperGrams = new Panel();

    public void init(){
        //region SWING(OMG) JComboBox
        Integer[] kgList = {0,20,40,60,80,100,120,140,160};
        JComboBox valInt = new JComboBox(kgList);
        JComboBox jerInt = new JComboBox(kgList);
        JComboBox hansInt = new JComboBox(kgList);

        valInt.addActionListener(e ->{
            JComboBox cb = (JComboBox)e.getSource();
            Opdracht_44.valerieKg = (int)cb.getSelectedItem();
            repaint();
        });
        jerInt.addActionListener(e ->{
            JComboBox cb = (JComboBox)e.getSource();
            Opdracht_44.jeroenKg = (int)cb.getSelectedItem();
            repaint();
        });
        hansInt.addActionListener(e ->{
            JComboBox cb = (JComboBox)e.getSource();
            Opdracht_44.hanskG = (int)cb.getSelectedItem();
            repaint();
        });

        wrapperGrams.add(valInt);
        wrapperGrams.add(jerInt);
        wrapperGrams.add(hansInt);
        add(wrapperGrams);
        wrapperGrams.requestFocus();
        //endregion
    }

    public void paint(Graphics g){
        super.paint(g);
        int startX = 100, startY = 60;
        int max = startY+160, margin = 10, cWidth = 45;

        //main lines
        g.setColor(Color.black);
        g.drawLine(startX, startY, startX, startY+max);
        g.drawLine(startX, startY+max, startX+(4*margin+3*cWidth), startY+max);

        //Valerie
        g.setColor(Color.black);
        g.drawString("Valerie", startX+margin, startY+max+15);
        g.setColor(Color.pink);
        g.fillRect(startX+margin, startY+max-valerieKg, cWidth, valerieKg);

        //Jeroen
        g.setColor(Color.black);
        g.drawString("Jeroen", startX+margin*2+cWidth, startY+max+15);
        g.setColor(Color.blue);
        g.fillRect(startX+margin*2+cWidth, startY+max-jeroenKg, cWidth, jeroenKg);

        //Hans
        g.setColor(Color.black);
        g.drawString("Hans", startX+margin*3+cWidth*2, startY+max+15);
        g.setColor(Color.red);
        g.fillRect(startX+margin*3+cWidth*2, startY+max-hanskG, cWidth, hanskG);

        for(int i = -(max/20); i<0; i++){
            g.setColor(Color.gray);
            g.drawLine(startX, (startY+-i*20), startX+(4*margin+3*cWidth), (startY+-i*20));
            g.setColor(Color.black);
            g.drawString(""+ -(i*20) +"kg", startX-50, (max+startY+i*20)+5);
        }

    }
}
