package fabrici;

public class Body extends Medicament{
    public Body(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String afisareDetalii() {
        return "Medicamentul pentru body "+getDenumire()+"are pretul de "+getPret()+" ron";
    }
}
