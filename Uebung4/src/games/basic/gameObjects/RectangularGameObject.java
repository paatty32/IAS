package games.basic.gameObjects;

import games.basic.position.interfaces.Positionable;

/**
 * Repräsentiert rechteckige Spielobjekte.
 */
public class RectangularGameObject extends AbstractGameObject {

    private int height;
    private int width;

    public RectangularGameObject(Positionable positionable, int height, int width){
        super(positionable);
        this.height = height;
        this.width = width;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    @Override
    public void setPos(Positionable pos) {

    }

    @Override
    public void setPos(int x, int y) {

    }

    @Override
    public String toString(){

        return "Höhe: " + this.height + " Bereite: " + this.width + " Position: " + this.getPos() ;

    }

    @Override
    public boolean equals(Object other){
        if(other == null || !(other instanceof RectangularGameObject) ){
            return false;
        }
        RectangularGameObject otherRect = (RectangularGameObject) other;

        //Position und Größe müssen stimmen
        return ( ( this.getPos().equals(otherRect.getPos()) ) && ( this.width == otherRect.getWidth() )
                && ( this.height == otherRect.height ) );

    }


}
