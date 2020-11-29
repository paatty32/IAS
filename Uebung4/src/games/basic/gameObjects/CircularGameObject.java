package games.basic.gameObjects;

import games.basic.position.interfaces.Positionable;

/**
 * Repräsentiert kreisförmige Objekte.
 */
public class CircularGameObject extends AbstractGameObject{
    private int radius;

    public CircularGameObject(Positionable pos, int radius){
        super(pos);
        this.radius = radius;
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
}

