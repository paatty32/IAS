package games.basic.logging;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Durch das Entwurfsmuster Singleton soll es möglich sein nur ein Objekt dieser Klasse
 * zu erstellen.
 */
public class Logger {

    //Static -> Gilt für alle Objekte dieser Klasse
    private static Logger instance = null;

    /**
     * Private Konstruktor, damit kein Objekt von außen
     * erstellt werden kann.
     */
    private Logger(){};

    /**
     * Die Methode prüft, ob ein Objekt der Klasse Logger schon
     * erstellt wurde. Falls nicht wird eins erstellt ansonsten
     * wird das Objekt zurückgegeben.
     * Um die Methode Thread-Sicher zu machen wird sie noch mit dem
     * schlüsselwort synchronized
     * Erst Testen, dann machen ist unsicher ;)
     * Synchronized, dient dazu, dass die Methode erst vollkommend abgelaufen werden sein muss
     * von einem Thread bis ein anderer Thread diese Methode bentuzen darf.
     * @return Logger Objekt.
     */
    public synchronized static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }

        return instance;
    }

    void log(String message){
        System.out.println(message);
    }

    /**
     * Gibt die Exception und den Stacktrace auf dem Bildschirm aus.
     * @param ex Exception.
     */
    void log(Exception ex){
        ex.getMessage();
        ex.printStackTrace();
    }

    /**
     * Schreibt die Nachricht in eine Datei.
     * @param message Nachricht.
     * @param dateiName Name der Datei.
     */
    void log(String message, String dateiName) throws IOException {

        BufferedWriter os = new BufferedWriter((new FileWriter(dateiName+".txt")));
        os.write(message);
        os.close();

    }

}
