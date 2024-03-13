package factoryMethod.clase;

public class Gripa extends Medicament{
    public Gripa(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareMedicament() {
        System.out.printf("%s costa %s lei si este bun pentru gripa\n", super.getDenumire(), super.getPret());

    }
}
