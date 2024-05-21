public class Filiala implements Detalii{
    private String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println("Filiale: "+nume);
    }

    @Override
    public void adaugaAgentie(Agentie agentie) {

    }

    @Override
    public void adaugaFiliala(Filiala filiala) {

    }
}
