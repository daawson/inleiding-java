package h04_Tekenen;

import daawson.main.Helper;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class Opdracht_4Praktijk extends Applet {
    private static Color lineColor = Color.BLACK;
    private static Color fillColor = Color.MAGENTA;
    private static int cWidth = 200, cHeight = 120;
    private Panel cPanel = new Panel();

    public void init(){

        //region SETTINGS CHOOSER
        String[] colorList = {"White", "Black", "Magenta", "Red", "Green", "Blue"};
        JComboBox colorPicker = new JComboBox(colorList);
        colorPicker.addActionListener(e -> {
            JComboBox cb = (JComboBox)e.getSource();
            String opd = (String)cb.getSelectedItem();
            if(opd != null) {
                switch(opd) {
                    case "White":
                        Opdracht_4Praktijk.fillColor = Color.WHITE;
                        break;
                    case "Magenta":
                        Opdracht_4Praktijk.fillColor = Color.MAGENTA;
                        break;
                    case "Black":
                        Opdracht_4Praktijk.fillColor = Color.BLACK;
                        break;
                    case "Red":
                        Opdracht_4Praktijk.fillColor = Color.RED;
                        break;
                    case "Green":
                        Opdracht_4Praktijk.fillColor = Color.GREEN;
                        break;
                    case "Blue":
                        Opdracht_4Praktijk.fillColor = Color.BLUE;
                        break;
                }
                repaint();
            }
        });
        JComboBox colorPicker2 = new JComboBox(colorList);
        colorPicker2.addActionListener(e -> {
            JComboBox cb = (JComboBox)e.getSource();
            String opd = (String)cb.getSelectedItem();
            if(opd != null) {
                switch(opd) {
                    case "White":
                        Opdracht_4Praktijk.lineColor = Color.WHITE;
                        break;
                    case "Magenta":
                        Opdracht_4Praktijk.lineColor = Color.MAGENTA;
                        break;
                    case "Black":
                        Opdracht_4Praktijk.lineColor = Color.BLACK;
                        break;
                    case "Red":
                        Opdracht_4Praktijk.lineColor = Color.RED;
                        break;
                    case "Green":
                        Opdracht_4Praktijk.lineColor = Color.GREEN;
                        break;
                    case "Blue":
                        Opdracht_4Praktijk.lineColor = Color.BLUE;
                        break;
                }
                repaint();
            }
        });

        SpinnerModel smw = new SpinnerNumberModel(100,50, 300, 10);
        JSpinner spinnerWidth = new JSpinner(smw);
        spinnerWidth.addChangeListener(e -> {
            cWidth = (int)spinnerWidth.getValue();
            repaint();
        });

        SpinnerModel smw1 = new SpinnerNumberModel(100,50, 300, 10);
        JSpinner spinnerHeight = new JSpinner(smw1);
        spinnerHeight.addChangeListener(e -> {
            cHeight = (int)spinnerHeight.getValue();
            repaint();
        });

        colorPicker2.setSelectedIndex(1);
        colorPicker.setSelectedIndex(2);
        spinnerWidth.setValue(200);
        spinnerHeight.setValue(120);
        //endregion

        cPanel.add(colorPicker);
        cPanel.add(colorPicker2);
        cPanel.add(spinnerWidth);
        cPanel.add(spinnerHeight);
        add(cPanel);
        cPanel.requestFocus();
    }

    public void paint(Graphics g){
        Helper.setCBackground(g, Color.WHITE);
        //MEINE INTES
        int startX = 15, startY = 50;
        int margin = 20;
        int stringwidth;

        // lijn
        g.setColor(lineColor);
        g.drawLine(startX, startY, startX+cWidth,startY);

        g.setColor(Color.black);
        stringwidth =  g.getFontMetrics().stringWidth("Lijn");
        g.drawString("Lijn", startX+cWidth/2-stringwidth/2, -5+startY+margin);


        // rechthoek
        g.setColor(lineColor);
        g.drawRect(startX,startY+margin, cWidth,cHeight);

        stringwidth =  g.getFontMetrics().stringWidth("Rechthoek");
        g.setColor(Color.black);
        g.drawString("Rechthoek", startX+cWidth/2-stringwidth/2,15+startY+cHeight+margin);

        // afgeronde rechthoek
        g.setColor(lineColor);
        g.drawRoundRect(startX,startY+margin*2+cHeight, cWidth,cHeight,15,15);

        stringwidth =  g.getFontMetrics().stringWidth("Afgeronde Rechthoek");
        g.setColor(Color.black);
        g.drawString("Afgeronde Rechthoek", startX+cWidth/2-stringwidth/2,15+startY+cHeight*2+margin*2);

        // gevulde rechthoek met ovaal
        g.setColor(fillColor);
        g.fillRect(startX+margin+cWidth, startY+margin, cWidth, cHeight);
        g.setColor(lineColor);
        g.drawArc(startX+margin+cWidth, startY+margin, cWidth, cHeight, 30, 360);

        g.setColor(Color.black);
        stringwidth =  g.getFontMetrics().stringWidth("Gevulde rechthoek met ovaal");
        g.drawString("Gevulde rechthoek met ovaal", startX+margin+cWidth+(cWidth/2-stringwidth/2),15+startY+cHeight+margin);

        //gevulde ovaal
        g.setColor(fillColor);
        g.fillArc(startX+margin+cWidth, startY+margin*2+cHeight, cWidth, cHeight, 30,360);

        g.setColor(Color.black);
        stringwidth =  g.getFontMetrics().stringWidth("Gevulde ovaal");
        g.drawString("Gevulde ovaal", startX+margin+cWidth+(cWidth/2-stringwidth/2),15+startY+cHeight*2+margin*2);

        //taartpunt met ovaal ermoheen
        g.setColor(fillColor);
        g.fillArc(startX+margin*2+cWidth*2, startY+margin, cWidth, cHeight, 0, 45);
        g.setColor(lineColor);
        g.drawArc(startX+margin*2+cWidth*2, startY+margin, cWidth, cHeight, 30,360);

        g.setColor(Color.black);
        stringwidth =  g.getFontMetrics().stringWidth("Taartpunt met ovaal eromheen");
        g.drawString("Taartpunt met ovaal eromheen", startX+margin*2+cWidth*2+(cWidth/2-stringwidth/2),15+startY+cHeight+margin);

        //Cirkel
        g.setColor(lineColor);
        //noinspection SuspiciousNameCombination
        g.drawArc(startX+margin*2+cWidth*2+cWidth/2-cHeight/2, startY+margin*2+cHeight, cHeight, cHeight, 90,360);

        g.setColor(Color.black);
        stringwidth =  g.getFontMetrics().stringWidth("Cirkel");
        g.drawString("Cirkel", startX+margin*2+cWidth*2+(cWidth/2-stringwidth/2),15+startY+cHeight*2+margin*2);

        super.paint(g);
    }
}
