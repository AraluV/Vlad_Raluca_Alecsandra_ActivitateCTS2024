package factoryMethod.program;

import factoryMethod.clase.Medicament;
import factoryMethod.fabrici.FabricaBody;
import factoryMethod.fabrici.FabricaDurere;
import factoryMethod.fabrici.FabricaGripa;
import factoryMethod.fabrici.FabricaMedicamente;

public class Main {
    public static void main(String[] args) {
        FabricaMedicamente fabricaDurere = new FabricaDurere("Durere", 20);
        procesareMedicament(fabricaDurere);

        FabricaMedicamente fabricaBody = new FabricaBody("body", 22.22f);
        procesareMedicament(fabricaBody);

        FabricaMedicamente fabricaGripa = new FabricaGripa("gripaaaa", 3232);
        procesareMedicament(fabricaGripa );
    }

    public static void procesareMedicament(FabricaMedicamente fabricaMedicamente) {
        Medicament medicament = fabricaMedicamente.creareMedicament();
        medicament.afisareMedicament();
    }
}
