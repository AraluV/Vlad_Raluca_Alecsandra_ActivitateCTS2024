package clase;

public class Client implements Copiere{
    private String nume;
    private int varsta;

    public Client(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public Copiere copiere() {
        return new Client(nume, varsta);
    }

    public void afisareDetalii(){
        System.out.println("Nume: "+nume+", varsta: "+varsta);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
