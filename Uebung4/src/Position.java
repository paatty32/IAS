public class Position implements Positionable {

    private int x;
    private int y;

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
}
