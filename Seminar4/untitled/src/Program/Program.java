package Program;

import clase.Durere;
import clase.Medicament;
import clase.MedicamentFactory;
import clase.TipMedicament;

public class Program {
    public static void main(String[] args) throws Exception {
        Medicament durere = MedicamentFactory.creareMedicament(TipMedicament.DURERE, "Paracetamol", 12,10);
        durere.afisareDetalii();

//        Durere durere1 = new Durere("nurofen", 15);
        Medicament body = MedicamentFactory.creareMedicament(TipMedicament.BODY, "Crema", 2222.22F,10);
        body.afisareDetalii();

        Medicament gripa = MedicamentFactory.creareMedicament(TipMedicament.GRIPA, "Gripa", 12, 6);
        gripa.afisareDetalii();
    }
}
