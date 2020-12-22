package games.basic.gameObjects;

import games.basic.position.interfaces.Positionable;

import java.awt.*;

/**
 * Repräsentiert kreisförmige Objekte.
 */
public class CircularGameObject extends AbstractGameObject{
    private int radius;

    private Color color;
    private boolean isfilled;

    public CircularGameObject(Positionable pos, int radius){
        super(pos);
        this.radius = radius;
        this.color = Color.BLUE;
    }

    public CircularGameObject(Positionable pos, int radius, Color color, boolean isfilled){
        super(pos);
        this.radius = radius;
        this.color = color;
        this.isfilled = isfilled;
    }

    /**
     * Durchmesser des Kreises.
     * @return Durchmesser
     */
    @Override
    public int getWidth(){
        return this.radius * 2;
    }

    /**
     * Durchmessser des Kreises
     * @return Durchmesser.
     */
    @Override
    public int getHeight(){
        return this.radius * 2;
    }

    @Override
    public String toString(){
        return "Radius: " + this.radius + " Position: " + this.getPos() ;
    }

    @Override
    public boolean equals(Object other){
        if(other == null || !(other instanceof CircularGameObject) ){
            return false;
        }
        CircularGameObject otherCirc = (CircularGameObject) other;

        //Position und Größe müssen stimmen
        return ( ( this.getPos().equals(otherCirc.getPos()) ) && ( this.radius == otherCirc.radius ) );
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;
        gg.setStroke(new BasicStroke(5));

        gg.setColor(this.color);

        if (this.isfilled){
            gg.fillOval(this.getPos().getX(), this.getPos().getY(), this.radius, this.radius);
        } else{
            gg.drawOval(this.getPos().getX(), this.getPos().getY(), this.radius, this.radius);
        }


    }
}

