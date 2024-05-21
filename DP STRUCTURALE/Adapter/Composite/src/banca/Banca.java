package banca;

import java.util.ArrayList;
import java.util.List;

public class Banca implements SucursalaBanca{
    private String nume;
    private List<Filiala> filiale;

    public Banca(String nume) {
        this.nume = nume;
        this.filiale = new ArrayList<>();
    }
    public void addFiliala(Filiala filiala){
        filiale.add(filiala);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Banca: "+nume+" contine urmatoarele filiale: "+filiale);
        for(Filiala filiala:filiale){
            filiala.afisareDetalii();
        }
    }
}
