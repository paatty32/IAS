package games.basic.position.interfaces;

public interface Positionable {

    int getX();
    int getY();
    void move(Positionable shift); //Verschiebe die Position um shift
    void moveTo(Positionable pos); // setze die Position auf pos
    void scale(int factor); //skaliere das Objekt um den Faktor factor
    void scale(int factorX, int factorY); //skaliere das Objekt um die jeweilige Faktoren

    /* Extra Methoden */
    void setX(int x);
    void setY(int y);
    void scaleX(int x);
    void scaleY(int y);
    String toString();
    boolean equals(Object other);


}
