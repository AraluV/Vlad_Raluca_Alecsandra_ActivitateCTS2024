package factoryMethod.fabrici;

import factoryMethod.clase.Durere;
import factoryMethod.clase.Medicament;

public class FabricaDurere extends FabricaMedicamente{
    public FabricaDurere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Durere(super.getDenumire(),super.getPret());
    }
}
