package h14_Multimedia;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;

public class Opdracht_142 extends Applet {

    private String[] kleur = {"Schoppen", "Harten", "Ruiten", "Klaveren"};
    private String[] num = {"Twee", "Drie", "Vier", "Vijf",
            "Zes", "Zeven", "Acht", "Negen",
            "Tien", "Boer", "Vrouw", "Heer",
            "Aas"};


    private ArrayList<String> cards = new ArrayList<>();

    private ArrayList<String> Player1 = new ArrayList<>();
    private ArrayList<String> Player2 = new ArrayList<>();
    private ArrayList<String> Player3 = new ArrayList<>();
    private ArrayList<String> Player4 = new ArrayList<>();

    public void init(){
        GenerateCardArray();
        DealCards();

        Button bReroll = new Button("Deal again!");
        bReroll.addActionListener(e->{
            GenerateCardArray();
            DealCards();
        });

        add(bReroll);
    }

    private void GenerateCardArray(){
        cards.clear();
        for (String aKleur : kleur) {
            for (String aNum : num) {
                String formatedCard = "";
                formatedCard = formatedCard.concat(aKleur + " " + aNum);
                cards.add(formatedCard);
            }
        }
    }

    private void DealCards(){
        Player1.clear(); Player2.clear(); Player3.clear(); Player4.clear();
        while(!cards.isEmpty()){
            for(int i = 0; i < 4; i++){

                int decksize = cards.size();
                double r = Math.random();
                int c = (int)(r*decksize);

                if(i == 0) Player1.add(cards.get(c));
                else if(i == 1) Player2.add(cards.get(c));
                else if(i == 2) Player3.add(cards.get(c));
                else Player4.add(cards.get(c));

                cards.remove(c);
            }
        }
        repaint();
    }

    public void paint(Graphics g){
        int count = 0;

        for(String s : Player1){
            g.drawString(s, 10, 60+15*count);
            count++;
        }

        count = 0;

        for(String s : Player2){
            g.drawString(s, 150, 60+15*count);
            count++;
        }

        count = 0;

        for(String s : Player3){
            g.drawString(s, 290, 60+15*count);
            count++;
        }

        count = 0;

        for(String s : Player4){
            g.drawString(s, 430, 60+15*count);
            count++;
        }
    }
}
