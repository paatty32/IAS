package exercises.gui.ring2;

import java.awt.*;

public class SingleRing {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public SingleRing(int x, int y, int groesse, Color color){
        this.x = x;
        this.y = y;
        this.width = groesse;
        this.height = groesse;
        this.color = color;
    }

    public void paintComponent(Graphics g){
        Graphics2D gg = (Graphics2D) g;
        gg.setStroke(new BasicStroke(5));

        gg.setColor(this.color);
        gg.drawOval(this.x, this.y, this.width, this.height);

    }

    public boolean equals(Object other){
        if(other == null || !(other instanceof SingleRing) ){
            return false;
        }
        SingleRing singleOther = (SingleRing) other;
        return (singleOther.color == this.color)&&
                (singleOther.height == this.height) &&
                (singleOther.width == this.width)&&
                (singleOther.x == this.x) &&
                (singleOther.y == this.y) ;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

}
