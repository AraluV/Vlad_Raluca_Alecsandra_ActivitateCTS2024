import java.util.ArrayList;
import java.util.List;

public class Sucursala implements Detalii{
    private String nume;
    private List<Agentie> agentii;

    public Sucursala(String nume) {
        this.nume = nume;
        this.agentii = new ArrayList<>();
    }

    @Override
    public void afiseaza() {
        System.out.println("Sucursala: "+nume+ " detine agentiile: "+agentii);
        for(Agentie agentie:agentii){
            agentie.afiseaza();
        }
    }

    @Override
    public void adaugaAgentie(Agentie agentie) {
        agentii.add(agentie);
    }

    @Override
    public void adaugaFiliala(Filiala filiala) {

    }
}
