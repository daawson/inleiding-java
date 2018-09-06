package h08_BasicComponents;

import java.applet.*;
import java.awt.*;

public class Opdracht_81 extends Applet {
    private TextField textField;
    private Label label;

    public void init(){

        Panel mainPanel = new Panel();
        mainPanel.setLayout(new FlowLayout());
        textField = new TextField("Type hier iets", 30);
        label = new Label("Hello");
        Button bOK = new Button("OK");
        Button bReset = new Button("Reset");

        bOK.addActionListener(e -> label.setText(textField.getText()));

        bReset.addActionListener(e ->{
            label.setText("");
            textField.setText("");
        });

        mainPanel.add(textField);
        mainPanel.add(label);
        mainPanel.add(bOK);
        mainPanel.add(bReset);
        this.add(mainPanel);
        //System.out.print(bOK.getLocation());
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
    }
}
