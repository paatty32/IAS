package games.basic.gameObjects;

import games.basic.position.interfaces.Positionable;

import java.awt.*;

/**
 * Repräsentiert rechteckige Spielobjekte.
 */
public class RectangularGameObject extends AbstractGameObject {

    private int height;
    private int width;

    private Color color;
    private boolean isfilled;

    public RectangularGameObject(Positionable positionable, int height, int width){
        super(positionable);
        this.height = height;
        this.width = width;
    }

    public RectangularGameObject(Positionable positionable, int height, int width, Color color, boolean isfilled){
        super(positionable);
        this.height = height;
        this.width = width;
        this.color = color;
        this.isfilled = isfilled;
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


    @Override
    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;
        gg.setStroke(new BasicStroke(5));

        gg.setColor(this.color);

        if (this.isfilled){
            gg.fillRect(this.getPos().getX(), this.getPos().getY(), this.width, this.height);
        } else{
            gg.drawRect(this.getPos().getX(), this.getPos().getY(), this.width, this.height);
        }


    }
}
