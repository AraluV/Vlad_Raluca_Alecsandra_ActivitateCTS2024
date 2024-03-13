package clase;

public class Raceala extends Medicament{
    protected Raceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.printf("%s costa %s lei si este bun pentru raceala", super.getDenumire(), super.getPret());
    }
}
