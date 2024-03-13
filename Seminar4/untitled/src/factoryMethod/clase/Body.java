package factoryMethod.clase;

public class Body extends Medicament {
    public Body(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareMedicament() {
        System.out.printf("%s costa %s lei si este bun pentru corp\n", super.getDenumire(), super.getPret());
    }
}
