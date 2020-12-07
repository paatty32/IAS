package games.basic.gameObjects.moveable;

import games.basic.position.interfaces.Positionable;



public class Ship extends AbstractMoveableGameObject {

    private int size;
    private boolean isHorizontal;

    public Ship(Positionable pos, Positionable deltaPos, int size, boolean isHorizontal) {
        super(pos, deltaPos);
        this.size = size;
        this.isHorizontal = isHorizontal;
    }


    public int getSize() {
        return size;
    }

    public boolean isHorizontal() {
        return isHorizontal;
    }

    @Override
    public int getWidth(){
        if(this.isHorizontal){
            return this.size;
        } return 1;
    }

    @Override
    public int getHeight(){
       if(this.isHorizontal){
           return 1;
       } return size;
    }

    @Override
    public String toString(){
        return "Position: " + this.getPos() + " Breite: " + this.getWidth() + " Höhe: " + this.getHeight()
                + " Verschiebung um: " + this.getDeltaPos();
    }

    @Override
    public boolean equals(Object other){
        if(other == null || !(other instanceof Ship)){
            return false;
        }

        Ship otherShip = (Ship) other;

        return
                //Positionen vergeleichen
                this.getPos().equals(otherShip.getPos()) &&
                //Objekt vergleichen
                this.isHorizontal == otherShip.isHorizontal() &&
                this.size == otherShip.size &&
                this.getDeltaPos().equals(otherShip.getDeltaPos());
    }
}
