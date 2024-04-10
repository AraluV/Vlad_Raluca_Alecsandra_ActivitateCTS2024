package fabrici;

public class FabribaBody extends FabricaMedicamente{
    public FabribaBody(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament getMedicament() {
        return new Body(super.getDenumire(),super.getPret());
    }
}
