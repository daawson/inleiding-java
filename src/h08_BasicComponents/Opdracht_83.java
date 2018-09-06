package h08_BasicComponents;

import java.applet.Applet;
import java.awt.*;
import java.text.DecimalFormat;

public class Opdracht_83 extends Applet {
    public void init(){
        setLayout(new BorderLayout());
        Panel holder = new Panel();
        TextField field = new TextField("350", 20);
        Button generateBTW = new Button("Add BTW");

        generateBTW.addActionListener(e->{
            double money = Double.parseDouble(field.getText());
            DecimalFormat df = new DecimalFormat("###.##");
            double maths = money+money*0.21;
            String format = df.format(maths);
            field.setText(""+format);
        });

        holder.add(field);
        holder.add(generateBTW);

        add(holder, BorderLayout.CENTER);
    }

    public void paint(Graphics g){
        super.paint(g);
    }
}
