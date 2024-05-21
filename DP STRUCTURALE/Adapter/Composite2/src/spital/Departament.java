package spital;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Spital{
    private String nume;
    private List<Subdepartament> subdepartamente;

    public Departament(String nume) {
        this.nume = nume;
        this.subdepartamente=new ArrayList<>();
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Departamentul: "+nume);
        for(Subdepartament subdepartament:subdepartamente){
            subdepartament.afisareDetalii();
        }
    }

    @Override
    public void adaugareSubDep(Subdepartament s) {
        subdepartamente.add(s);
    }
}
