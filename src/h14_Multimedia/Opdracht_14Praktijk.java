package h14_Multimedia;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;

public class Opdracht_14Praktijk extends Applet {
    private int rockCount = 23;
    enum State{
       Play, Reset
    }

    private State CurrentState = State.Play;
    private TextField input;
    private Label message;
    private Button bOK;

    private ArrayList<Integer> focus = new ArrayList<>();

    public void init(){
        message = new Label("Write 1, 2 or 3 to play!");
        input = new TextField();

        bOK = new Button("Play!");
        bOK.addActionListener(e->{
            if(CurrentState == State.Play)
                PlayWith(Integer.parseInt(input.getText()));
            else if(CurrentState == State.Reset){
                ReinitArray();
                rockCount = 23;
                message.setText("Write 1, 2 or 3 to play!");
                bOK.setLabel("Play");
                CurrentState = State.Play;
                repaint();
            }
        });

        ReinitArray();


        add(input);
        add(bOK);
        message.setPreferredSize(new Dimension(200,25));
        add(message);
    }

    private void PlayWith(int a){
        if(a > 3 || a < 0) {message.setText("Only 1, 2 or 3");}
        else if(rockCount-a < 0){message.setText("Number too big!");}
        else {
            rockCount -= a;

            if(rockCount == 0){
                message.setText("You lost! :(");
                bOK.setLabel("Reset");
                CurrentState = State.Reset;
            }
            else {

                DoMagic();
            }
        }
        input.setText("");
        repaint();

    }

    private void DoMagic(){ // 1,5,9,13,17,21
        int lastnum = rockCount;
        for (int i = 0; i < focus.size(); i++) {
            int checker = focus.get(i);
            System.out.println(checker);
            if (rockCount - 1 == checker) {
                rockCount -= 1;
                System.out.println(checker + " " + (rockCount-1));
                focus.remove(focus.get(i));
                break;
            } else if (rockCount - 2 == checker){
                rockCount -= 2;
                System.out.println(checker + " " + (rockCount-2));
                focus.remove(focus.get(i));
                break;
            } else if (rockCount - 3 == checker) {
                rockCount -= 3;
                System.out.println(checker + " " + (rockCount-3));
                focus.remove(focus.get(i));
                break;
            } else if(checker == rockCount) {
                double r = Math.random();
                int c = (int)(r*3+1);
                System.out.println(checker + " " + (rockCount-c));
                rockCount-=c;
                focus.remove(focus.get(i));
                break;
            }
        }

        if(rockCount <= 0){
            message.setText("You won! :)");
            CurrentState = State.Reset;
            bOK.setLabel("Reset");
        }else{
            message.setText("Current rocks: " + rockCount + " BOT took: " + (lastnum-rockCount) + " rocks!");
        }
    }

    private void ReinitArray(){
        focus.clear();
        focus.add(21);focus.add(17);focus.add(13);focus.add(9); focus.add(5); focus.add(1);
    }

    public void paint(Graphics g){
        int row = 0, col = 0;
        for(int x = 0; x < rockCount; x++){
            if(x % 8 == 0){col++; row = 0;}
            g.setColor(Color.gray);
            g.fillOval(25+row*35, 25+col*35, 20,20);
            row++;
        }

    }
}
