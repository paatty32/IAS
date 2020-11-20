public class Person {

    private int einkommen; //tatsächliche Jahreseinkommen
    private final double STEUER = 0.25; //Konstante, die bei bedarf geändert werden kann.
    String name;

    /**
     * Konstruktor
     * @param name Name der Person
     * @param einkommen Einkommen der Peson
     */
    public Person(String name, int einkommen){
        this.einkommen = einkommen;
        this.name = name;
    }
    /**
     * Das zu versteurende Einkommen entspricht dem tatsächlichen Einkommen
     * einer Person.
     * @return einkommen.
     */
    public int zuVersteuerndesEinkommen(){
        return this.einkommen;
    }

    /**
     * Berechnet die Steuer fuer eine Person, die er zu Zahlen hat.
     * @return abgerunderter Steuer Betrag.
     */
    public int steuer(){
        double steuer = this.einkommen * this.STEUER;

        return (int) steuer;

    }


    public int nettEinkommen(){
        return this.zuVersteuerndesEinkommen() - steuer();
    }
    public String toString(){
        return "Name: " + this.name + " Einkommen(Brutto): " + this.einkommen + " Zu zahlende Steuer: " + this.steuer()
                + " Einkommen(Netto): " + this.nettEinkommen();
    }



}
