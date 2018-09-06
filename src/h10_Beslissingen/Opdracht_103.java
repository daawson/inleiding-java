package h10_Beslissingen;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_103 extends Applet { // opd 10.3 en 10.4

    private int[] aDays= {31,28,31,30,31,30,31,31,30,31,30,31};
    private String[] aMonths= {"Jan.", "Feb.", "Mrt.", "Apr.", "Mei.", "Jun.", "Jul.", "Aug.", "Sept.", "Okt.", "Nov.", "Dec."};
    int choosen = 2, aYear = 2020;

    public void init(){
        TextField monthField = new TextField();
        monthField.setText(choosen+"");
        monthField.setSize(90,20);
        monthField.addActionListener(e->{
            choosen = Integer.parseInt(monthField.getText());
            repaint();
        });

        TextField yearField = new TextField();
        yearField.setText(aYear+"");
        yearField.setSize(90,20);
        yearField.addActionListener(e->{
            aYear = Integer.parseInt(yearField.getText());
            repaint();
        });
        add(monthField);
        add(yearField);
        repaint();
    }
    private String GetFormatedDate(){
        if(choosen >= 1 && choosen <= 12){
            String format = "";
            if(choosen == 2){ // if feb.
                if(aYear % 4 == 0 && aYear % 100 != 0 || aYear % 400 == 0) { // special year.
                    format = "29, " + aMonths[choosen - 1] + " " + aYear;
                }
                else {
                    format = aDays[choosen - 1] + ", " + aMonths[choosen - 1] + " " + aYear; // just feb 28
                }
            }
            else{
                format = aDays[choosen-1]+", "+aMonths[choosen-1]+" "+aYear; // normal year
            }
            return format;
        }
        else return "Error";
    }
    public void paint(Graphics g){
        g.drawString(GetFormatedDate(), 60,60);
    }

}
