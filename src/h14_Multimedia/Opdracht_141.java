package h14_Multimedia;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_141 extends Applet {
    String[] kleur = {"Schoppen", "Harten", "Ruiten", "Klaveren"};
    String[] num = {"Twee", "Drie", "Vier", "Vijf",
                    "Zes", "Zeven", "Acht", "Negen",
                    "Tien", "Boer", "Vrouw", "Heer",
                    "Aas"};

    String formatedCard = "";
    public void init(){
        Button bRandom = new Button("Randomize!");
        bRandom.addActionListener(e->{
            randomizeCard();
            repaint();
        });
        add(bRandom);
    }
    public void paint(Graphics g){
        g.drawString(formatedCard, 90,90);
    }

    void randomizeCard(){
        formatedCard = "";
        double r1 = Math.random();
        int rf = (int)(r1 * 4);
        formatedCard = formatedCard.concat(""+kleur[rf]);
        System.out.println(rf);
        r1 = Math.random();
        rf = (int)(r1 * 13);
        formatedCard = formatedCard.concat(" "+num[rf]);
        System.out.println(rf);
    }
}
