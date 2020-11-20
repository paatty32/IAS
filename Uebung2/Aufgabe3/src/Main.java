public class Main {

    public static void main(String[] args){

        Point p = new Point(1,4);
        p.scale(2);
        System.out.println("Scale: " + p.toString());

        p.move( new Point(2, -5));
        System.out.println("Move: " +  p.toString());

        Point q = new Point();
        System.out.println("Neuer Punkt(Default Konstruktor): " + q.toString());

        System.out.println("p = " + p.toString());
        System.out.println("q = " + q.toString());
        System.out.println("Distance = " + p.distance(q) );
        System.out.println("p.equals(q) = " + p.equals(q));
    }
}
