package banca;

public class Filiala implements SucursalaBanca{
    private String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Filiala: "+nume);
    }
}
