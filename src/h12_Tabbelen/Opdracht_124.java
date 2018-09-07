package h12_Tabbelen;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;

public class Opdracht_124 extends Applet { // opd 12.4 en 12.5
    private ArrayList<Integer> elligableNumbers = new ArrayList<>();
    private String message = "";
    public void init(){

        elligableNumbers.add(3);
        elligableNumbers.add(10);
        elligableNumbers.add(13);
        elligableNumbers.add(23);
        elligableNumbers.add(29);

        TextField input = new TextField();
        Button bOK = new Button("OK");
        bOK.addActionListener(e->{
            CheckForNumber(Integer.parseInt(input.getText()));
            input.setText("");
        });

        input.addActionListener(e->{
            CheckForNumber(Integer.parseInt(input.getText()));
            input.setText("");
        });

        add(input);
        add(bOK);
    }
    void CheckForNumber(int a){
        for(int i : elligableNumbers) {
            if (a == i) {
                message = "Number "+a+" found on index "+elligableNumbers.indexOf(a);
                break;
            }
            else{
                message = "Number "+a+" not found!";
            }
        }
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(message, 60,60);
    }
}
