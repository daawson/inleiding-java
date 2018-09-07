package h10_Beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Opdracht_105 extends Applet {

    private List<Double> gradeList = new ArrayList<>();
    private String allGrades ="";
    private boolean updateMid = false;
    private double gemiddelde = 0.0;
    DecimalFormat df = new DecimalFormat("#.#");
    public void init(){
        TextField gradeField = new TextField();
        Button bOK = new Button("OK");

        gradeField.addActionListener(e->{
            gradeList.add(Double.parseDouble(gradeField.getText()));
            allGrades = "";
            for(double i : gradeList) {
                allGrades = allGrades.concat(i+",");
            }
            gradeField.setText("");
            repaint();
        });

        bOK.addActionListener(e->{
            updateMid = true;
            repaint();
        });

        add(gradeField);
        add(bOK);

    }
    private double getGemiddelde(){
        if(updateMid) {
            double sum = 0.0;
            for (double i : gradeList) {
                {
                    sum += i;
                }
            }
            updateMid = false;
            gemiddelde = sum / (gradeList.size()+1);
            return gemiddelde;
        }else{
            return gemiddelde;
        }
    }
    public void paint(Graphics g){
        g.drawString(allGrades, 40, 40);
        if(updateMid)
            g.drawString("Gemmidelde is: " + df.format(getGemiddelde()) + " : " + ((getGemiddelde() >= 5.5) ? "Voldoende :)":"Onvoldoende :("), 40, 80);
    }
}
