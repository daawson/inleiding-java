package daawson.main;

import javax.swing.*;
import java.awt.*;

public class Main{

    private static AppletMaster appm = new AppletMaster();
    private static JFrame mainFrame = new JFrame("Inleiding Java Opdrachten");
    private static JPanel mainPanel = new JPanel();

    public static void main(String[] args){

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        String[] opdList = {"Opdracht 2.1", "Opdracht 2.2","Opdracht 4.1",
                            "Opdracht 4.2", "Opdracht 4.3", "Opdracht 4.4",
                            "Opdracht 4.5", "Opdracht 4.6", "Opdracht 4.7", "Praktijkopdracht"};
        JComboBox selectorBox = new JComboBox(opdList);
        selectorBox.setPreferredSize(new Dimension(300, 25));
        selectorBox.setLightWeightPopupEnabled(false);
        selectorBox.setOpaque(true);

        selectorBox.addActionListener(e -> {
                JComboBox cb = (JComboBox)e.getSource();
                String opd = (String)cb.getSelectedItem();
                try{
                    switch(opd){
                        case "Opdracht 2.1":
                            appm.setView(0);
                            break;
                        case "Opdracht 2.2":
                            appm.setView(1);
                            break;
                        case "Opdracht 4.1":
                            appm.setView(2);
                            break;
                        case "Opdracht 4.2":
                            appm.setView(3);
                            break;
                        case "Opdracht 4.3":
                            appm.setView(4);
                            break;
                        case "Opdracht 4.4":
                            appm.setView(5);
                            break;
                        case "Opdracht 4.5":
                            appm.setView(6);
                            break;
                        case "Opdracht 4.6":
                            appm.setView(7);
                            break;
                        case "Opdracht 4.7":
                            appm.setView(8);
                            break;
                        case "Praktijkopdracht":
                            appm.setView(9);
                            break;
                        default:
                            appm.setView(0);
                            break;
                    }
                }catch(NullPointerException ex) {
                    System.out.print("NPE!");
                }
        });

        appm.init();
        mainPanel.add(selectorBox);
        selectorBox.setSelectedIndex(0);
        mainPanel.add(appm);
        mainPanel.setSize(300, 400);

        mainFrame.add(mainPanel);
        mainFrame.setSize(600,425);
        mainFrame.setVisible(true);

        appm.setView(0);

    }


}
