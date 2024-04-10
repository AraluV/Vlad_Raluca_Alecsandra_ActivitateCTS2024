package Sportiv;

public abstract class Sportiv {
    private String nume;

    public Sportiv(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void afisareDetalii();
}
