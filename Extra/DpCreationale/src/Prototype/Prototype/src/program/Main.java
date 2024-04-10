package program;

import transport.Autobuz;
import transport.Avion;
import transport.TransportClone;

public class Main {
    public static void main(String[] args){
        Autobuz autobuzInitial=new Autobuz("Audi",33);
        autobuzInitial.afisareDetalii();
        Autobuz autobuz2=(Autobuz) autobuzInitial.clone();
        autobuz2.setMarca("BMW");
        autobuz2.afisareDetalii();

        Avion avionInitial=new Avion("CSS",55);
        avionInitial.afisareDetalii();
        Avion avion2=(Avion) avionInitial.clone();
        avion2.setNumar(69);
        avion2.afisareDetalii();
    }
}
