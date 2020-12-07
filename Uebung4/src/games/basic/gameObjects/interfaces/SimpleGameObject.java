package games.basic.gameObjects.interfaces;

import games.basic.position.interfaces.Positionable;

/**
 * Dient zur Verwaltung und Bewegung von SpielObjekten auf dem Spielfeld.
 */
public interface SimpleGameObject {

    Positionable getPos();
    int getWidth();
    int getHeight();

    //Zusätzliche Methoden
    void setPos(Positionable pos);
    void setPos(int x, int y);


}
