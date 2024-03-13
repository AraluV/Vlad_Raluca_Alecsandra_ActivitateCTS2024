package factoryMethod.fabrici;

import factoryMethod.clase.Gripa;
import factoryMethod.clase.Medicament;

public class FabricaGripa extends FabricaMedicamente{
    public FabricaGripa(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Gripa(super.getDenumire(),super.getPret());
    }
}
