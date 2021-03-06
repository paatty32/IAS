package games.basic.gameObjects.interfaces;

public interface GameObject extends SimpleGameObject, PaintableGameObject {

    boolean isLeftOf(GameObject other); //befindet sich das Objekt (this) links vom anderen Objekt other ?
    boolean isRightOf(GameObject other);
    boolean isAbove(GameObject other);
    boolean isBelow(GameObject other);
    boolean touches(GameObject other); //Überprüft, ob sich zwei Spielobjekte gegenseitig berühren, d.h sich deren
                                       //Positionen partiell überschneiden

}
