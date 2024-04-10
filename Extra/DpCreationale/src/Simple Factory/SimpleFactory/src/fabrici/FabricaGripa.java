package fabrici;

public class FabricaGripa extends FabricaMedicamente{
    public FabricaGripa(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament getMedicament() {
        return new Gripa(super.getDenumire(),super.getPret());
    }
}
