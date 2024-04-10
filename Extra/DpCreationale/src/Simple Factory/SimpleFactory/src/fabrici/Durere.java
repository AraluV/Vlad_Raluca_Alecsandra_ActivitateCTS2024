package fabrici;

public class Durere extends Medicament{
    public Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String afisareDetalii() {
        return "Medicamentul pentru Durere "+getDenumire()+ "re pretul de "+getPret();
    }
}
