package h12_Tabbelen;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Opdracht_123 extends Applet {
    private TextField[] fInput = new TextField[5];
    private ArrayList<Integer> holder = new ArrayList<>();

    public void init() {
        for(int i = 0; i < 5; i++){
            fInput[i] = new TextField();
            add(fInput[i]);
        }

        Button bOK = new Button("OK");
        bOK.addActionListener(e->{
            RearrangeNumbers();
        });

        add(bOK);
    }


    private void RearrangeNumbers(){
        holder.clear();
        for(int i = 0; i < 5; i++){
            holder.add(Integer.parseInt(fInput[i].getText()));
        }

        Collections.sort(holder);

        for(int i = 0; i < 5; i++){
            fInput[i].setText(""+holder.get(i));
        }
    }
    public void paint(Graphics g){}
}
