package exercises.gui.ring2;


import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Rings {

    public static void main(String args[]){

         SingleRing olymp1 = new SingleRing(50, 200 , 90, Color.BLUE);
         SingleRing olymp2 = new SingleRing(50 + 100, 200 , 90, Color.BLACK);
         SingleRing olymp3 = new SingleRing(50 + 200, 200 , 90, Color.RED);
         SingleRing olymp4 = new SingleRing((50 + 100) - 50, 200 + 50 , 90, Color.YELLOW);
         SingleRing olymp5 = new SingleRing((50 + 200)-50, 200 + 50 , 90, Color.GREEN);

        ArrayList<SingleRing> ringList = new ArrayList<SingleRing>();
        ringList.add(olymp1);
        ringList.add(olymp2);
        ringList.add(olymp3);
        ringList.add(olymp4);
        ringList.add(olymp5);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //damit beim Schließen des Fensters das Programm beendet wird.

        RingPanel olymRings = new RingPanel(ringList);

        frame.add(olymRings);

        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
