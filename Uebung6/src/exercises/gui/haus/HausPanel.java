package exercises.gui.haus;

import javax.swing.*;
import java.awt.*;

public class HausPanel extends JPanel {



    @Override
    public void paintComponent(Graphics g){
        //X1,Y1,X2,Y2
        //Waagerechter Strich
        g.drawLine(120,400,320, 400);
        //Linker senkrechter Strich
        g.drawLine(120, 400, 120 , 200);
        //Rechter Waagerechter Strich
        g.drawLine(320, 400, 320, 200);
        //Linker schräger strich
        g.drawLine(120, 400, 320, 200);
        //Rechter schräger strich
        g.drawLine(320, 400,120, 200);
        //Oberer Waagerecher Strich
        g.drawLine(120, 200, 320, 200);
        //Dach strich links
        g.drawLine(120, 200, 220, 100);
        //Dach strich rechts
        g.drawLine(320, 200, 220 , 100);

    }
}


