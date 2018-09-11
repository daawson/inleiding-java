package h12_Tabbelen;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_121 extends Applet {
    private int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    private int mid;
    public void init(){
        int count = 0;
        for (int number : numbers) {
            count += number;
        }

        mid = count/(numbers.length+1); // +1 want arrays startn op 0
    }
    public void paint(Graphics g){
        for(int i = 0; i < numbers.length; i++){
            g.drawString(""+numbers[i], 25+i*15, 25);
        }
        g.drawString("Gemiddelde is: "+mid, 25, 40);
    }

}
