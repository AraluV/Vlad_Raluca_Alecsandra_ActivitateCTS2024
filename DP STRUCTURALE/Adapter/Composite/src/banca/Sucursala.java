package banca;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements SucursalaBanca{
    private String nume;
    private List<Banca> banci;

    public Sucursala(String nume) {
        this.nume = nume;
        this.banci = new ArrayList<>();
    }
    public void adaugaBanca(Banca banca){
        banci.add(banca);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Sucursala: "+nume);
        for(Banca banca:banci){
            banca.afisareDetalii();
        }
    }
}
