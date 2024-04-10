package spital;

import java.util.HashMap;
import java.util.Map;

public class RetetaMedicament implements Reteta{
    private String nume;
    private Map<String, Integer> cantitatiSolutii;

    public RetetaMedicament(String nume, Map<String, Integer> cantitatiSolutii) {
        this.nume = nume;
        this.cantitatiSolutii = cantitatiSolutii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


    @Override
    public Reteta clone() {
        Map<String,Integer> cantitatiSolutiiClone=new HashMap<>(cantitatiSolutii);
        return new RetetaMedicament(nume,cantitatiSolutiiClone);
    }

    @Override
    public void produce() {
        System.out.println("Reteta cu numele "+nume+" contine cantitatile de solutie "+ cantitatiSolutii);
    }
}
