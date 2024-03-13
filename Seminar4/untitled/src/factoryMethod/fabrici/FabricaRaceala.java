package factoryMethod.fabrici;

import factoryMethod.clase.Medicament;
import factoryMethod.clase.Raceala;

public class FabricaRaceala extends FabricaMedicamente{
    private int cantitate;
    public FabricaRaceala(String denumire, float pret, int cantitate) {
        super(denumire, pret);
        this.cantitate = cantitate;
    }

    @Override
    public Medicament creareMedicament() {
        return new Raceala(super.getDenumire(),super.getPret(), this.cantitate);
    }
}
