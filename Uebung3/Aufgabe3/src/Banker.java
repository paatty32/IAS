public class Banker extends Person {

    public Banker(String name, int einkommen ){
        super(name, einkommen);
    }

    /**
     * Berechnet die Steuer eines Bankers.
     * Bank muss während der gegenwärtigen Krise von der Regierung 1000 pfund steuern zusätlich zahlen.
     * Wenn der zu zahlende Betrag größer als das einkommen ist, wird das einkommen zurückgegben.
     * @return zu zahlende Steuer.
     */
    @Override
    public int steuer() {
        int steuer = super.steuer() + 1000;

        //Steuern könnten größer werden als das Einkommen -> Danke IDE :)
        return Math.min(steuer, this.zuVersteuerndesEinkommen());
    }
}
