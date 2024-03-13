package clase;

public class Durere extends Medicament{
    protected Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.printf("%s costa %s lei si este bun pentru durere", super.getDenumire(), super.getPret());
    }
}
