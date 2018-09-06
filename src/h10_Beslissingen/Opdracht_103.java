package h10_Beslissingen;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_103 extends Applet {

    private int[] aDays= {31,28,31,30,31,30,31,31,30,31,30,31};
    private String[] aMonths= {"Jan", "Feb", "Ma", "Apr", "Mei", "Juni", "Juli", "Aug", "Sep", "Okt", "Nov", "Dec"};
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
        if(choosen > 0 && choosen < 11){
            String format = "";
            if(choosen == 2){
                if(aYear % 4 == 0 && aYear % 100 != 0 || aYear % 400 == 0) {
                    //System.out.print("ELO PRZESTEMPCO XD");
                    format = "29, " + aMonths[choosen - 1] + " " + aYear;
                }
                else {
                    format = aDays[choosen - 1] + ", " + aMonths[choosen - 1] + " " + aYear;
                    //System.out.print("ELO POLICJANCIE XD");
                }
            }
            else{
                format = aDays[choosen-1]+", "+aMonths[choosen-1]+" "+aYear;
                //System.out.print("LUZIK ARBUZIK XD");
            }
            return format;
        }
        else return "Error";
    }
    public void paint(Graphics g){
        g.drawString(GetFormatedDate(), 60,60);
    }

}
