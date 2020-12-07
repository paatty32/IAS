package games.basic.gameObjects.interfaces;

import games.basic.position.interfaces.Positionable;

public interface Moveable {

    void move();
    void setDeltaPos(Positionable shift);
    Positionable getDeltaPos();
    void reverseXDirection(); //Ändert die Bewegungsrichtung
    void reverseYDirection();
    void reverseDirection();
}
