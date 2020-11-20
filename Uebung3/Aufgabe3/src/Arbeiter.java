public class Arbeiter extends Person{

    public Arbeiter(String name, int einkommen ){
        super(name, einkommen);
    }

    /**
     * Berechnet des Versteuerndes Einkommen einer Person.
     * Die Person erhält einen Steuerfreibetrag von 2.400 pfund.
     * @return Zu versteuenders einkommen abzüglich des Freibetrags.
     */
    @Override
    public int zuVersteuerndesEinkommen() {
        int einkommen = super.zuVersteuerndesEinkommen() - 2400;
        //Einkommen kleiner 0 ist möglich.
        if(einkommen >= 0){
            return einkommen;
        }
        else return 0;
    }
}
