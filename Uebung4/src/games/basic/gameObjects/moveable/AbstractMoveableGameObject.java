package games.basic.gameObjects.moveable;

import games.basic.gameObjects.AbstractGameObject;
import games.basic.gameObjects.interfaces.Moveable;
import games.basic.position.Position;
import games.basic.position.interfaces.Positionable;

/**
 * In dieser Klasse befinden sich
 */
public abstract class AbstractMoveableGameObject extends AbstractGameObject implements Moveable {

    private Positionable deltaPos; //Delta Position, um das das Objekt verschoben werden soll

    public AbstractMoveableGameObject(Positionable pos, Positionable deltaPos) {
        super(pos);
        this.deltaPos = deltaPos;
    }


    /**
     * Verschiebt das Objekt um die Position delta.
     */
    @Override
    public void move(){
        this.setPos( (this.getPos().getX() + deltaPos.getX()),
                this.getPos().getY() + this.deltaPos.getX() );
    }

    @Override
    public Positionable getDeltaPos(){
        return this.deltaPos;
    }

    @Override
    public void setDeltaPos(Positionable shift){
        this.deltaPos = shift;
    }

    /**
     * Die X-Achse wird umgekehrt.
     * wenn x positiv ist wird es negativ und umgekehrt.
     */
    @Override
    public void reverseXDirection(){
        this.deltaPos.scaleX(-1);
    }

    /**
     * Die Y-Achse wird umgekehrt.
     * Wenn y positiv wird es negativ und umgekehrt
     */
    @Override
    public void reverseYDirection(){
        this.getDeltaPos().scaleY(-1);
    }

    @Override
    public void reverseDirection(){
        this.reverseXDirection();
        this.reverseYDirection();
    }


}
