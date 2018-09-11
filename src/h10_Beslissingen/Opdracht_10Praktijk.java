package h10_Beslissingen;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_10Praktijk extends Applet {
    private int num = 0;
    private Label info = new Label("Numbers 1-10 only");
    public void init(){
        setLayout(new FlowLayout());
        TextField input = new TextField();
        info.setPreferredSize(new Dimension(200, 30));
        input.addActionListener(e->{
            try{
                num = Integer.parseInt(input.getText());
                DoLogic();
                repaint();
            }catch(Exception ae){
                info.setText("EMPTY FIELD or NOT A NUMBER");
                repaint();
            }
            input.setText("");
        });

        add(input);
        add(info);
    }
    private void DoLogic(){
        if(num >= 1 && num <= 10){
            if(num == 1 || num == 2 || num == 3 )
                info.setText("Slecht ("+num+")");
            else if(num == 4)
                info.setText("Onvoldoende ("+num+")");
            else if(num == 5 )
                info.setText("Matig ("+num+")");
            else if(num == 6 || num == 7)
                info.setText("Voldoende ("+num+")");
            else
                info.setText("Goed ("+num+")");
        }else
            info.setText("1-10 ONLY");
    }
    public void paint(Graphics g){}
}