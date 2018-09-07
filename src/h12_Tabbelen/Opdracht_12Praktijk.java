package h12_Tabbelen;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_12Praktijk extends Applet {
    int maxElements = 10;
    int cElement = 0;
    int switchCount = 0;
    boolean readyToPaint = false;
    String[] names = new String[maxElements];
    int[] numbers = new int[maxElements];

    Label county;

    public void init(){
        setLayout(new FlowLayout());
        TextField fName = new TextField("Write a name!");
        fName.setPreferredSize(new Dimension(150,25));

        TextField fNum = new TextField("Write a number");
        fNum.setPreferredSize(new Dimension(150,25));

        Button bOK = new Button("OK");
        bOK.addActionListener(e->{
            if(fNum.getText() != null || fName.getText() != null){
                if(cElement != maxElements) {
                    names[cElement] = fName.getText();
                    numbers[cElement] = Integer.parseInt(fNum.getText());
                    cElement++;

                    fName.setText("");
                    fNum.setText("");

                    county.setText(""+cElement);
                }
                else{
                    readyToPaint = true;
                    county.setText("");
                    repaint();
                }
            }
            else{
                county.setText("You didnt write in one of the fields!");
            }
        });

        county = new Label("Write Name and Number!");
        add(fName);
        add(fNum);
        add(bOK);
        add(county);
    }
    public void paint(Graphics g){
        if(readyToPaint){
            for(int i = 0; i < maxElements; i++){
                g.drawString(names[i] + ", "+numbers[i], 60,80+i*15);
            }
        }
    }
}
