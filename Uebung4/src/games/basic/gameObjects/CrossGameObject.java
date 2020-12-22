package games.basic.gameObjects;

import games.basic.position.Position;
import games.basic.position.interfaces.Positionable;

import java.awt.*;

public class CrossGameObject extends AbstractGameObject {

    private int width;
    private int height;
    private Color color;

    public CrossGameObject(Positionable pos, Color color){
        super(pos);
        this.color = color;
    }


    @Override
    public void paintComponent(Graphics g) {

        Graphics2D gg = (Graphics2D) g;
        gg.setStroke(new BasicStroke(5));

        gg.setColor(this.color);

        //Linker schräger strich
        gg.drawLine(this.getPos().getX(), this.getPos().getY(), this.getPos().getX() + 200, this.getPos().getY() + 200);
        //Rechter schräger strich
        gg.drawLine(this.getPos().getX() + 200, this.getPos().getY(),this.getPos().getX(), this.getPos().getY() + 200 );



    }
}
