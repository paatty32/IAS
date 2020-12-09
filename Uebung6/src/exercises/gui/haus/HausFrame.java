package exercises.gui.haus;

import javax.swing.*;

public class HausFrame {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //damit beim Schließen des Fensters das Programm beendet wird.

        HausPanel hausVomNikolaus = new HausPanel();
        frame.add(hausVomNikolaus);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
