package exercises.gui.ring2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RingPanel extends JPanel {

    private ArrayList<SingleRing> ringList;

    public RingPanel(ArrayList<SingleRing> ringList){
        this.ringList = ringList;
    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D gg = (Graphics2D) g;
        gg.setStroke(new BasicStroke(5));

        for(SingleRing ring: this.ringList){
            gg.setColor(ring.getColor());
            gg.drawOval(ring.getX(), ring.getY(), ring.getWidth(), ring.getHeight());
        }
    }
}
