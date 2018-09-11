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
        message = new Label("Write 1, 2 or to play!");
        input = new TextField();

        bOK = new Button("Play!");
        bOK.addActionListener(e->{
            if(CurrentState == State.Play)
                PlayWith(Integer.parseInt(input.getText()));
            else if(CurrentState == State.Reset){
                ReinitArray();
                rockCount = 23;
                message.setText("Write 1, 2 or to play!");
                bOK.setLabel("Play");
                CurrentState = State.Play;
                repaint();
            }
        });

        ReinitArray();

        add(message);
        add(input);
        add(bOK);
    }

    private void PlayWith(int a){
        if(a > 3 || a < 0) {message.setText("Only 1, 2 or 3");}
        else if(rockCount-a < 0){message.setText("Number too big!");}
        else {
            rockCount -= a;

            if(rockCount == 0){
                message.setText("You lost! :(");
                CurrentState = State.Reset;
            }
            else {

                DoMagic();
            }
        }
        input.setText("");
        repaint();

    }

    private void DoMagic(){
        //region TEST
        /*
        int closest = Helper.getClosest(focus, rockCount);
        int diff = rockCount-closest;
        System.out.println(closest + " " + diff);

        if(diff != 0) {
            if (diff < 4 && diff > 0) {
                rockCount -= diff;

            } else if (diff < 0) {
                rockCount = rockCount - (-diff);
            }
        }
        else{
                rockCount -= 3;
        }
        */
        //endregion

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
            } else {
                rockCount-=3;
                break;
            }
        }

        if(rockCount <= 0){
            message.setText("You won! :)");
            CurrentState = State.Reset;
            bOK.setLabel("Reset");
        }else{
            message.setText("Current rocks: " + rockCount);
        }
    }

    private void ReinitArray(){
        focus.add(21);focus.add(17);focus.add(13);focus.add(9); focus.add(5); focus.add(1);
    }

    public void paint(Graphics g){
        int row = 0, col = 0;
        for(int x = 0; x < rockCount; x++){
            if(x % 4 == 0){col++; row = 0;}
            g.setColor(Color.gray);
            g.fillOval(25+row*25, 25+col*25, 20,20);
            row++;
        }

    }
}
