package exercises.gui.ring1;

import exercises.gui.haus.HausPanel;

import javax.swing.*;

public class Rings {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //damit beim Schließen des Fensters das Programm beendet wird.

        RingPanel olymp = new RingPanel(50, 200 , 90);
        frame.add(olymp);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
