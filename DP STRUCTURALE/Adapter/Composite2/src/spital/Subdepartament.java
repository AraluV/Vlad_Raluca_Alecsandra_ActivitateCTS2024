package spital;

public class Subdepartament implements Spital{
    private String nume;

    public Subdepartament(String nume) {
        this.nume = nume;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Subdepartament: "+nume);
    }

    @Override
    public void adaugareSubDep(Subdepartament s) {
        throw new UnsupportedOperationException();
    }
}
