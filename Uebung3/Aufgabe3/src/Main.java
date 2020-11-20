public class Main {

    public static void main(String[] args){

        Person joe = new Person("Joe Unemployed", 6400);
        Arbeiter suzi = new Arbeiter("Suzi Hard-Working", 36000);
        Banker fred = new Banker("Fred Moneymaker", 4000000);
        Koenigin elisaneth = new Koenigin("Elisabeth", 1000000);

        Finanzamt finanzamt = new Finanzamt();

        Person[] einwohner = {joe, suzi, fred, elisaneth};

        for(int i = 0; i < einwohner.length; i++){
            System.out.println(einwohner[i].toString());
        }

        System.out.println("Zu Zahlende steuer des ganzen Landes: " + finanzamt.berechneSteuer(einwohner));


    }
}
