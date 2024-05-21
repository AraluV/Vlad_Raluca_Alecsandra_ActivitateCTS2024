package platforma;

import firma.Bilet;
import firma.BiletFirma;
import platforma.EBiletPlatforma;

public class AdapterBilet implements EBilet {
    private BiletFirma firma;

    public AdapterBilet(BiletFirma firma) {
        this.firma = firma;
    }

    @Override
    public void vindeBilet() {
        firma.rezervaBilet();
        EBiletPlatforma  platforma=new EBiletPlatforma();
        platforma.vindeBilet();
    }
}
