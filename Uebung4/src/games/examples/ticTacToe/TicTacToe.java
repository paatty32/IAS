package games.examples.ticTacToe;

import games.basic.gameObjects.CircularGameObject;
import games.basic.gameObjects.CrossGameObject;
import games.basic.gameObjects.interfaces.GameObject;
import games.basic.position.Position;
import games.basic.position.interfaces.Positionable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import static java.lang.StrictMath.random;

public class TicTacToe {

    static boolean redTurn;
    static ArrayList<Positionable> loadedPositionals = new ArrayList<Positionable>();


    public static void main(String args[]){

        final String[] ersterSpieler = new String[1];


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonPanel = new JPanel();

        ArrayList<GameObject> objectArrayList = new ArrayList<GameObject>();

        /* Auskommentiert für die Aufgabe 4
        CrossGameObject cross1 = new CrossGameObject(new Position(200, 200), Color.RED);
        CrossGameObject cross2 = new CrossGameObject(new Position(400, 400), Color.RED);
        CircularGameObject circle1 = new CircularGameObject(new Position(0, 0),200, Color.BLUE, false);
        CircularGameObject circle2 = new CircularGameObject(new Position(0, 400), 200, Color.BLUE, false);

        objectArrayList.add(cross1);
        objectArrayList.add(circle1);
        objectArrayList.add(circle2);
        objectArrayList.add(cross2);
        */
        TicPanel ticPanel = new TicPanel(objectArrayList);
        ticPanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

                System.out.println("Position:" + mouseEvent.getPoint());

                int xPos = 0;
                int yPos = 0;

                //Bereich in der ersten linken oberen Ecke wurde angeklickt
                if(mouseEvent.getPoint().getX() > 0.0 && mouseEvent.getPoint().getX() <= 200.0){
                    xPos = 0;
                } else if(mouseEvent.getPoint().getX() > 200.0 && mouseEvent.getPoint().getX() <= 400){
                    xPos = 200;
                } else if(mouseEvent.getPoint().getX() > 400.0 && mouseEvent.getPoint().getX() <= 600){
                    xPos = 400;
                }

                if(mouseEvent.getPoint().getY() > 0.0 && mouseEvent.getPoint().getY() <= 200){
                    yPos = 0;
                } else if(mouseEvent.getPoint().getY() > 200.0 && mouseEvent.getPoint().getY() <= 400){
                    yPos = 200;
                } else if(mouseEvent.getPoint().getY() > 400.0 && mouseEvent.getPoint().getY() <= 600){
                    yPos = 400;
                }

                //Kreuz ist dran
                if(redTurn){

                    CrossGameObject cross = new CrossGameObject(new Position(xPos, yPos), Color.RED);

                    if(loadedPositionals.size() <= 0) {
                        System.out.println("TEST3");
                        objectArrayList.add(cross);
                        redTurn = false; //Kreis (Blau) ist jetzt dran
                        loadedPositionals.add(cross.getPos());
                    } else {
                        System.out.println("TEST");
                        System.out.println("OBJECT SIZE VORHER:" + objectArrayList.size());

                        int objectArrSizeVorher = loadedPositionals.size();

                        //Wenn das Feld frei ist
                        if (!loadedPositionals.contains(cross.getPos())) {
                            redTurn = false; //Kreis (Blau) ist jetzt dran
                            objectArrayList.add(cross);
                            // loadedPositionals.add(cross.getPos());
                        } else {
                            //JOptionPane.showMessageDialog(null, "Feld ist schon belegt");
                            System.out.println("Feld belegtg");
                            }

                        System.out.println("OBJECT SIZE NACHHER:" + objectArrayList.size());
                        if(objectArrSizeVorher != objectArrayList.size()){
                            loadedPositionals.add(cross.getPos());
                        }
                    }


                } else { //Kreis ist dran

                    CircularGameObject circle = new CircularGameObject(new Position(xPos, yPos), 200);
                    if(loadedPositionals.size() <= 0) {

                        objectArrayList.add(circle);
                        redTurn = true; //Kreuz (Rot) ist jetzt dran
                        loadedPositionals.add(circle.getPos());
                    } else {
                        System.out.println("SIZE:" + loadedPositionals.size());
                        int objectArrSizeVorher = loadedPositionals.size();

                        //System.out.println(loadedPositionals.get(i).equals(circle.getPos()));
                        if (!loadedPositionals.contains(circle.getPos())) {
                            System.out.println("TEST2");
                            redTurn = true; //Kreuz (Rot) ist jetzt dran
                            objectArrayList.add(circle);

                            //loadedPositionals.add(circle.getPos());
                        } else {
                            // JOptionPane.showMessageDialog(null, "Feld ist schon belegt");
                            System.out.println("Feld belegtg");
                        }

                        System.out.println("OBJECT SIZE NACHHER:" + objectArrayList.size());
                        if(objectArrSizeVorher != objectArrayList.size()){
                            loadedPositionals.add(circle.getPos());
                        }
                    }

                }
                ticPanel.repaint(); //ruft von allen Elementen die paintComponent methode auf
                if(objectArrayList.size() == 9){
                    JOptionPane.showMessageDialog(null, "Unentschieden!");
                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        JButton neuesSpiel = new JButton("Neues Spiel");
        neuesSpiel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                objectArrayList.clear();
                loadedPositionals.clear();
                frame.repaint();
                neuesSpiel.setText("Neues Spiel wurde geklickt");
            }
        });

        JButton ende = new JButton("Ende");
        ende.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
                ende.setText("Text wurde geklickt");
            }
        });

        JButton ersterSpielerButton = new JButton("Ersten Spieler Auswählen");
        ersterSpielerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String blue = "Spieler Blau(Kreis)";
                String red = "Spieler Rot(Kreuz)";

                ArrayList<String> spieler = new ArrayList<String>();

                spieler.add(red);
                spieler.add(blue);

                ersterSpieler[0] = spieler.get( (int) (Math.random() * 2));

                JOptionPane.showMessageDialog(null, ersterSpieler[0] + " ist zuerst dran");

                if(ersterSpieler[0].toLowerCase().contains(red.toLowerCase())){
                    redTurn = true;
                } else {
                    redTurn = false;
                }
            }
        });

        buttonPanel.add(ersterSpielerButton);
        buttonPanel.add(neuesSpiel);
        buttonPanel.add(ende);


        frame.add(BorderLayout.CENTER,ticPanel);
        frame.add(BorderLayout.SOUTH, buttonPanel);


        frame.setSize(650,700);
        frame.setVisible(true);
    }


}
