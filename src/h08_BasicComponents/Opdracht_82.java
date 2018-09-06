package h08_BasicComponents;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class Opdracht_82 extends Applet {

    private static int mannen=-1;
    private static int vrouwen;
    private static int mll;
    private static int vll;
    private static JLabel dataHolder;

    enum Type{
        Man, Vrouw, Mll, Vll
    }

    public void init(){

        Panel holder = new Panel();
        holder.setLayout(new FlowLayout());

        Button man = new Button("Mannen");
        Button vrouw = new Button("Vrouwen");
        Button manll = new Button("MLL");
        Button vrouwll = new Button("VLL");

        man.addActionListener(e -> countAgain(Type.Man));

        vrouw.addActionListener(e -> countAgain(Type.Vrouw));

        manll.addActionListener(e -> countAgain(Type.Mll));

        vrouwll.addActionListener(e -> countAgain(Type.Vll));

        dataHolder = new JLabel(""); // in gewoone jlabel html werk niet
        countAgain(Type.Man);

        holder.add(man);
        holder.add(vrouw);
        holder.add(manll);
        holder.add(vrouwll);
        holder.add(dataHolder);
        setLayout(new BorderLayout());
        add(holder, BorderLayout.CENTER);
    }

    private void countAgain(Type type){
        if(type == Type.Man){mannen++;}
        else if(type == Type.Vrouw){vrouwen++;}
        else if(type == Type.Mll){mll++;}
        else if(type == Type.Vll){vll++;}

        int totaal = mannen + vrouwen + mll + vll;

        dataHolder.setText("<html>Aantal mannen: "+mannen+
                "<br>Aantal vrouwen: "+vrouwen+
                "<br>Aantal MLL: "+mll+
                "<br>Aantal VLL: "+vll+
                "<br>Totaal: "+ totaal +"</html>");
        repaint();
    }

    public void paint(Graphics g){
        super.paint(g);
        //Helper.setCBackground(g, Color.lightGray);

    }
}
