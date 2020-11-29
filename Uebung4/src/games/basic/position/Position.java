package games.basic.position;

import games.basic.position.interfaces.Positionable;

public class Position implements Positionable {

    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Position(){

    }

    @Override
    public int getX() {

        return this.x;
    }

    @Override
    public int getY() {

        return this.y;
    }

    @Override
    public void move(Positionable shift) {
        if(shift != null){
            this.x += shift.getX();
            this.y += shift.getY();
        }
    }

    @Override
    public void moveTo(Positionable pos) {
        if(pos != null){
            this.x = pos.getX();
            this.y = pos.getY();
        }
    }

    @Override
    public void scale(int factor) {
        this.x *= factor;
        this.y *= factor;
    }

    @Override
    public void scale(int factorX, int factorY) {
        this.x *= factorX;
        this.y *= factorY;
    }

    @Override
    public void setX(int x) {

        this.x = x;
    }

    @Override
    public void setY(int y) {

        this.y = y;
    }

    @Override
    public void scaleX(int x) {
        this.x *= x;
    }

    @Override
    public void scaleY(int y) {
        this.y *= y;
    }

    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

    @Override
    public boolean equals(Object other){
        if(other == null || !(other instanceof Position) ){
            return false;
        }
        Position otherPos = (Position) other;
        return ( this.x == otherPos.getX() ) && ( this.y == otherPos.getY() );
    }


}
