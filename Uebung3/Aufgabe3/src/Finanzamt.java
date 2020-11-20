/**
 * Berechnet die gesamte Steuereinahmen des Landes
 */
public class Finanzamt {

    /**
     * Berechnet die Steereinahmen des ganezn Landes.
     * @param personen gesamte Personen, die Steuern zahlen.
     * @return Steuereinahme des Landes.
     */
    public int berechneSteuer(Person[] personen){

        int steuereinahmeLand = 0;

        for(int i = 0; i < personen.length; i++){

            steuereinahmeLand += personen[i].steuer();

        }

        return steuereinahmeLand;
    }

}
