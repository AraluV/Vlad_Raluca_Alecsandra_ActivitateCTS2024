package main;

//Agenția de turism dorește să ofere pentru o perioadă de trei luni
//        posibilitatea de anulare a pachetelor rezervate. Această ofertă expiră în
//        trei luni. Managerul agenției nu dorește să modifice codul, deoarece
//        după trei luni trebuie să modifice iar codul sursă.

import agentie.AgentieRezervare;
import agentie.Decorator;
import agentie.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare optiune=new AgentieRezervare();
        Rezervare decorator=new Decorator(optiune,2);
        decorator.anuleaza();

        Rezervare optiune2=new AgentieRezervare();
        Rezervare decorator2=new Decorator(optiune,5);
        decorator2.anuleaza();
    }
}