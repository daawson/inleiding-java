package h08_BasicComponents;

//import daawson.main.Helper;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.text.DecimalFormat;

public class Opdracht_8Praktijk extends Applet {

    TextField fieldOne, fieldTwo;
    Button add, sub, multiply, divide;
    Panel holder;
    JLabel errorLabel = new JLabel("Type een nummer in!"); //in gewone label html werkt niet
    enum MathType{
        Add, Subtract, Multiply, Divide
    }

    public void init(){

        setLayout(new BorderLayout());

        holder = new Panel();
        holder.setLayout(new FlowLayout());

        fieldOne = new TextField("10");
        fieldOne.setPreferredSize(new Dimension(100, 25));
        fieldTwo = new TextField("10");
        fieldTwo.setPreferredSize(new Dimension(100, 25));


        add = new Button("+");
        add.addActionListener(e-> {
            calculateByType(fieldOne, fieldTwo, MathType.Add);
        });


        sub = new Button("-");
        sub.addActionListener(e-> {
            calculateByType(fieldOne, fieldTwo, MathType.Subtract);
        });
        multiply = new Button("*");
        multiply.addActionListener(e-> {
            calculateByType(fieldOne, fieldTwo, MathType.Multiply);
        });
        divide = new Button("/");
        divide.addActionListener(e-> {
            calculateByType(fieldOne, fieldTwo, MathType.Divide);
        });

        holder.add(fieldOne);
        holder.add(fieldTwo);
        holder.add(add);
        holder.add(sub);
        holder.add(multiply);
        holder.add(divide);
        holder.add(errorLabel);
        add(holder, BorderLayout.CENTER);
    }

    private void calculateByType(TextField aa, TextField bb, MathType type){
        double a = 0,b = 0;
        boolean canContinue;
        try{
            a = Double.parseDouble(aa.getText());
            b = Double.parseDouble(bb.getText());
            canContinue = true;
        }catch(Exception e){
            //System.out.print(e.getMessage());
            errorLabel.setText("<html>Something went wrong: <br>"+e.getMessage()+"</html>");
            canContinue = false;
        }
        double sum = 0.0;
        if(canContinue) {
            if (type == MathType.Add)
                sum = a + b;
            else if (type == MathType.Subtract)
                sum = a - b;
            else if (type == MathType.Multiply)
                sum = a * b;
            else if (type == MathType.Divide)
                sum = a / b;

            DecimalFormat df = new DecimalFormat("#.##");
            String format = df.format(sum);
            fieldOne.setText(format);
            fieldTwo.setText("");
        }
    }

    public void paint(Graphics g){
        super.paint(g);
    }
}
