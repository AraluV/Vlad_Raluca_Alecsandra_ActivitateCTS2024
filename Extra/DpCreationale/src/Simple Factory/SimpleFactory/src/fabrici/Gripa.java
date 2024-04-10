package fabrici;

public class Gripa extends Medicament{

    public Gripa(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String afisareDetalii() {
        return "Medicamentul pentru Gripa "+getDenumire() + " are pretul de "+getPret();
    }
}
