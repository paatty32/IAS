package exercises.gui.ring1;

import exercises.gui.ring2.SingleRing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RingPanel extends JPanel {

    private int x;
    private int y;
    private int width;
    private int height;


    public RingPanel(int x, int y, int groesse){
        this.x = x;
        this.y = y;
        this.width = groesse;
        this.height = groesse;
    }


    @Override
    public void paintComponent(Graphics g){
        Graphics2D gg = (Graphics2D) g;
        gg.setStroke(new BasicStroke(5));
        //Erster Kreis
        gg.setColor(Color.BLUE);
        gg.drawOval(this.x, this.y, this.width, this.height);
        //Zweiter Ring
        gg.setColor(Color.BLACK);
        gg.drawOval(this.x + 100, this.y, this.width, this.height);
        //dritter Ring
        gg.setColor(Color.RED);
        gg.drawOval(this.x + 200, this.y, this.width, this.height);
        //zweiter unterer Ring
        gg.setColor(Color.YELLOW);
        gg.drawOval(this.x + 100 - this.x, this.y + 50 , this.width, this.height);
        //zweite unterer Ring rechts
        gg.setColor(Color.GREEN);
        gg.drawOval(this.x + 200 - this.x, this.y + 50 , this.width, this.height);

    }

}
