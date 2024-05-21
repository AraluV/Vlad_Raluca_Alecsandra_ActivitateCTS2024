import java.util.ArrayList;
import java.util.List;

public class Agentie implements Detalii{
    private String nume;
    private List<Filiala> filiale;

    public Agentie(String nume) {
        this.nume = nume;
        this.filiale = new ArrayList<>();
    }

    @Override
    public void afiseaza() {
        System.out.println("Agentia: "+nume+" contine filialele: "+filiale);
        for(Filiala filiala:filiale){
            filiala.afiseaza();
        }
    }

    @Override
    public void adaugaAgentie(Agentie agentie) {

    }

    @Override
    public void adaugaFiliala(Filiala filiala) {
        filiale.add(filiala);
    }
}
