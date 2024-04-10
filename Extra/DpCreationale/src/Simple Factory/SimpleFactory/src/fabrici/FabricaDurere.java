package fabrici;

public class FabricaDurere extends FabricaMedicamente{
    public FabricaDurere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament getMedicament() {
        return new Durere(super.getDenumire(),super.getPret());
    }
}
