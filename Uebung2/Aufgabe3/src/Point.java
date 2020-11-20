public class Point {

    //Double als Datentyp
    private double x;
    private double y;

    /**
     * Kontrsuktor um die Punkte zu setzen.
     * @param x X-Koordinate.
     * @param y Y-Koordinate.
     */
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Default-Konstruktor, der die Punkte auf 0 setzt.
     */
    Point(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Getter Methode
     * @return X-Koordinate.
     */
    public double getX(){
        return this.x;
    }

    /**
     * Getter Methode
     * @return Y-Koordinate.
     */
    public double getY(){
        return this.y;
    }

    /**
     * Erstellt eine lesbare Darstellung für die Koordinaten.
     * @return (x,y)
     */
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

    /**
     * Soll die Koordinaten entsprechend des anderen Punktes shift verschieben.
     * @param shift Verschiebevektors.
     * @return verschobenes Objekt.
     */
   public Point move(Point shift){
        if(shift != null){
            this.x = this.x + shift.getX();
            this.y = this.y + shift.getY();
        }

        return this;
    }

    /**
     * Verschiebt die Koordinaten zum anderen Punkt newPos
     * @param newPos Neue Position des Punktes
     * @return neue Position
     */
    Point moveTo(Point newPos){
        if(newPos != null){
            this.x = newPos.getX();
            this.y = newPos.getY();
        }
        //wenn newPos null ist soll die aktuelle Position zurückgegeben werden
        return this;
    }

    /**
     * Skaliert die Koordinaten
     * @param factor skalierungsfaktor
     * @return skalierter vektor
     */
    public Point scale(double factor){
        this.x = this.x * factor;
        this.y = this.y * factor;

        return this;
    }

    /**
     * Abstand des Punnktes vom Koordinatenursprung(0,0)
     * @return Abstand
     */
    //Kann auf private sein, da die Methode nur innerhalbd er Klasse benutzt wird
    private double distance(){

        double abstand = Math.sqrt( (this.x * this.x) + (this.y * this.y) );

        return abstand;
    }

    /**
     * Berechnet die Distanz von zwei Vektoren.
     * @param other anderer Vektor
     * @return distanz.
     */
    public double distance(Point other) {
        if (other != null) {
            //1. Beide Koodinaten voneinander abziehen.
            double x = this.x - other.getX();
            double y = this.y - other.getY();

            //2. Neues Objekt erstellen mit diesen Koordinaten
            Point differenz = new Point(x, y);

            //3. länge dieses objekts berechnen -> distance() aufrufen
            return differenz.distance();
        }

        return -1;
    }

    /**
     * Vergleicht zwei Objekte,
     * @param other das vergleichende Objekt.
     * @return true oder false.
     */
    public boolean equals(Point other){
        if(other == null){
            return false;
        }

        return ( (this.x == other.getX() ) && (this.y == other.getY() ) );
    }





}
