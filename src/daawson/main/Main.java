package daawson.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{

    private static AppletMaster appm = new AppletMaster();
    private static JFrame mainFrame = new JFrame("Inleiding Java Opdrachten");
    private static JPanel mainPanel = new JPanel();

    public static void main(String[] args){

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        //region JButtons en ActionListeners
        JButton o21 = new JButton("Opdracht 2.1");
        o21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appm.getContentPane().setBackground(Color.BLUE);
                appm.setView(0);

            }
        });

        JButton o22 = new JButton("Opdracht 2.2");
        o22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appm.getContentPane().setBackground(Color.BLUE);
                appm.setView(1);

            }
        });

        JButton o41 = new JButton("Opdracht 4.1");
        o41.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appm.getContentPane().setBackground(Color.white);
                appm.setView(2);

            }
        });

        JButton o42 = new JButton("Opdracht 4.2");
        o42.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appm.getContentPane().setBackground(Color.white);
                appm.setView(3);

            }
        });
        //endregion

        appm.init();
        mainPanel.add(o21);
        mainPanel.add(o22);
        mainPanel.add(o41);
        mainPanel.add(o42);
        mainPanel.add(appm);
        mainPanel.setSize(300, 500);

        mainFrame.add(mainPanel);
        mainFrame.setSize(300,500);
        mainFrame.setVisible(true);

        appm.setView(0);

    }


}
