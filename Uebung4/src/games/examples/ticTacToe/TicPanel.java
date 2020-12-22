package games.examples.ticTacToe;

import games.basic.gameObjects.interfaces.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class TicPanel extends JPanel  {

    private ArrayList<GameObject> gameObjectsList;

    public TicPanel(ArrayList<GameObject> gameObjectsList){
        this.gameObjectsList = gameObjectsList;
        //this.addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        //Erste Senkrechte linie
        g.drawLine(200, 0, 200, 600);
        //Zweite Senktechte linie
        g.drawLine(400, 0, 400, 600);
        //dritter senkrechte linie
        g.drawLine(600, 0, 600, 600 );
        //erste Waagerechte linie
        g.drawLine(0, 200, 600, 200);
        //zweite Waagerechte linie
        g.drawLine(0, 400, 600, 400);
        //dritter waagerechte linie
        g.drawLine(0, 600, 600, 600);

        for(GameObject elem: gameObjectsList){
            elem.paintComponent(g);
        }
    }


}
