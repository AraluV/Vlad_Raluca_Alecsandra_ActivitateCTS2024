package main;

//8. Este dorita reprezentarea departamentelor spitalului in cadrul aplicației. Fiecare departament
//        conține subdepartamente sau secții. Secțiile nu conțin subsecții. Sa se implementeze modulul care
//        permite reprezentarea arborescenta a departamentelor si secțiilor spitalului.

import spital.Departament;
import spital.Spital;
import spital.Subdepartament;

public class Main {
    public static void main(String[] args) {
        Spital dep=new Departament("DERMATO");
        dep.adaugareSubDep(new Subdepartament("VENERO"));
        dep.afisareDetalii();

        Spital dep2=new Departament("GEEEEEA");
        dep2.adaugareSubDep(new Subdepartament("REFVG"));
        dep2.afisareDetalii();
    }
}