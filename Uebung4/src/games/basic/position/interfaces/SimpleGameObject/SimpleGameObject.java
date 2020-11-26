package games.basic.position.interfaces.SimpleGameObject;

import games.basic.position.interfaces.Positionable;

/**
 * Dient zur Verwaltung und Bewegung von SpielObjekten auf dem Spielfeld.
 */
public interface SimpleGameObject {

    Positionable getPos();
    int getWidth();
    int getHeight();

}
