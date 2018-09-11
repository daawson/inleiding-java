package h11_Herhaling;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_11Praktijk_1 extends Applet {
    private int cNum = 1;
    public void init(){
        TextField nField = new TextField();
        Button bOK = new Button("OK");

        bOK.addActionListener(e->{
            cNum = Integer.parseInt(nField.getText());
            repaint();
            nField.setText("");
        });

        nField.addActionListener(e->{
            cNum = Integer.parseInt(nField.getText());
            repaint();
            nField.setText("");
        });

        add(nField);
        add(bOK);
    }
    public void paint(Graphics g) {
        for(int i = 1; i < 10; i++){
            g.drawString(i + " * " + cNum + " = "+cNum*i, 25, 25+i*19);
        }
    }
}
