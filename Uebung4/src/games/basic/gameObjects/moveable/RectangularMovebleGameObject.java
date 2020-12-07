package games.basic.gameObjects.moveable;

import games.basic.gameObjects.RectangularGameObject;
import games.basic.position.interfaces.Positionable;

public class RectangularMovebleGameObject extends AbstractMoveableGameObject{

    private int width;
    private int height;

    public RectangularMovebleGameObject(Positionable pos, Positionable deltaPos, int width, int height) {
        super(pos, deltaPos);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return "Position: " + this.getPos() + "Height: " + this.getHeight() + "Width: " + this.getWidth()
                + "Verschiebung um: " + this.getDeltaPos();
    }

    @Override
    public boolean equals(Object other){
        if(other == null || !(other instanceof RectangularMovebleGameObject)){
            return false;
        }

        RectangularMovebleGameObject otherRec = (RectangularMovebleGameObject) other;

        return
                //Positionen Vergleichen
                this.getPos().equals(otherRec.getPos()) &&
                //Objekt vergleichen
                this.getWidth() == otherRec.getWidth() &&
                this.getHeight() == otherRec.getHeight() &&
                this.getDeltaPos().equals(otherRec.getDeltaPos());
    }

}
