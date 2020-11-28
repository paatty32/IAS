package games.basic.position.interfaces.SimpleGameObject;

public interface GameObject extends SimpleGameObject{

    boolean isLeftOf(GameObject other); //befindet sich das Objekt (this) links vom anderen Objekt other ?
    boolean isRightOf(GameObject other);
    boolean isAbove(GameObject other);
    boolean isBelow(GameObject other);
    boolean touches(GameObject other); //Überprüft, ob sich zwei Spielobjekte gegenseitig berühren, d.h sich deren
                                       //Positionen partiell überschneiden

}
