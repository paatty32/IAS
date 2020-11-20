public class Koenigin extends Person {

    public Koenigin(String name, int einkommen){
        super(name, einkommen);
    }

    /**
     * Koenigin zahlt keine Steuern
     * @return Steuer der Königin.
     */
    @Override
    public int steuer() {
        return 0;
    }
}
