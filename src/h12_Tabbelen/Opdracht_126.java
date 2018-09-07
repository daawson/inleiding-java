package h12_Tabbelen;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Opdracht_126 extends Applet {
    private int max = 10, min = 1;
    private int totalRandoms = 100;
    private int freq = 0, choosen = 0;
    private ArrayList<Integer> randoms = new ArrayList<>();
    public void init(){
        GenerateRandomNumbers();

        TextField tf = new TextField("Type number between "+min+"-"+max);
        tf.addActionListener(e->{
            choosen = Integer.parseInt(tf.getText());
            freq = Collections.frequency(randoms, choosen);
            tf.setText("");
            repaint();
        });

        add(tf);
    }
    public void paint(Graphics g){
        g.drawString("Total count of number "+choosen+" is: " + freq, 60,60);
    }

    private void GenerateRandomNumbers(){
        for(int i = 0; i < totalRandoms; i++){
            Random r = new Random();
            randoms.add(r.nextInt((max - min) + 1) + min);
            //System.out.print(r.nextInt((100 - 1) + 1) + 1)+ " ");
        }
    }
}
