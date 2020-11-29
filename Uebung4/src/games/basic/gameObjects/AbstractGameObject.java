package games.basic.gameObjects;

import games.basic.position.interfaces.Positionable;
import games.basic.position.interfaces.SimpleGameObject.GameObject;

public abstract class AbstractGameObject implements GameObject {

    private Positionable pos;

    //Für die Unterklassen.
    public AbstractGameObject(Positionable pos){
        this.pos = pos;
    }

    @Override
    public boolean isLeftOf(GameObject other) {
        if(other == null){
            return false;
        }
        //die breite fängt ab der x-koordinate an -> die breite hört an der stelle x+breite auf.
        int widthEndPos = this.getWidth() + this.getPos().getX();
        return ( widthEndPos < other.getPos().getX() );
    }

    @Override
    public boolean isRightOf(GameObject other) {
        if(other == null) {
            return false;
        }
        //Wenn other links vom Objekt ist das die Methode aufruft dann ist this rechts von other
        return other.isLeftOf(this);
    }

    @Override
    public boolean isAbove(GameObject other) {
        if(other == null){
            return false;
        }
        int heightEndPos = this.getHeight() + this.getPos().getY();
        //Koordinatensystem fängt oben links mit (0,0) an. -> je kleiner der y-wert desto höher ist die position des
        //punktes.-> je höher die desto weiter unten streckt sich die figur
        return (heightEndPos < other.getHeight());
    }

    @Override
    public boolean isBelow(GameObject other) {
        if(other == null) {
            return false;
        }
        //ist other über this dann ist this unter other
        return other.isAbove(this);
    }

    @Override
    public boolean touches(GameObject other) {
        if(other == null){
            return false;
        }
        //Wenn eins der vier Methoden zutrifft, können sich 2 Figuren nicht berühren
        if(this.isLeftOf(other) || this.isRightOf(other) || this.isAbove(other) || this.isBelow(other)){
            return false;
        } else {
            return true;
        }

    }

    //Ist die toString Methode, die in Position überschrieben wurde
    @Override
    public Positionable getPos() {
        return this.pos;
    }
    //Wird in den Unterklassen überschrieben und kann von daher erstmal 0 zurückgeben in der Abstrakten Klasse
    @Override
    public int getWidth() {
        return 0;
    }

    //Wird in den Unterklassen überschrieben und kann von daher erstmal 0 zurückgeben in der Abstrakten Klasse
    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void setPos(Positionable pos){
        this.pos = pos;
    }

    @Override
    public void setPos(int x, int y){
        this.pos.setX(x);
        this.pos.setY(y);
    }


}
