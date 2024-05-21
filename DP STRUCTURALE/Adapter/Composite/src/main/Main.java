package main;

//9. Să se implementeze structura ierarhică a agențiilor băncii știindu-se faptul că o sucursală deține
//        mai multe agenții, iar o agenție deține mai multe filiale.

import banca.Banca;
import banca.Filiala;
import banca.Sucursala;
import banca.SucursalaBanca;

public class Main {
    public static void main(String[] args) {
        Sucursala sucursala1=new Sucursala("Sucursala centrala");
        Banca banca1=new Banca("BCR");
        Banca banca2=new Banca("BT");
        Filiala filiala1=new Filiala("Filiala1");
        banca1.addFiliala(new Filiala("Filiala1"));
        banca1.addFiliala(new Filiala("Filiala2"));
        banca2.addFiliala(new Filiala("Filiala 1.1"));
        banca2.addFiliala(new Filiala("Filiala 1.2"));
        sucursala1.adaugaBanca(banca1);
        sucursala1.adaugaBanca(banca2);
        sucursala1.afisareDetalii();
    }
}