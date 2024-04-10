package main;

import pacient.ModulNotificare;
import pacient.Pacient;

public class Main {
    public static void main(String[] args) {
        //primim instanta
        ModulNotificare modulNotificare=ModulNotificare.getInstance();

        Pacient pacient1=new Pacient("John");
        Pacient pacient2=new Pacient("Mirel");
        Pacient pacient3=new Pacient("Augustin");

        modulNotificare.aboneaza(pacient1);
        modulNotificare.aboneaza(pacient2);
        modulNotificare.aboneaza(pacient3);

        modulNotificare.trimitereNotificare("Exista o epidemie in oras!");
        modulNotificare.dezaboneaza(pacient2);
        modulNotificare.trimitereNotificare("Virusul a fost identificat!");
    }
}