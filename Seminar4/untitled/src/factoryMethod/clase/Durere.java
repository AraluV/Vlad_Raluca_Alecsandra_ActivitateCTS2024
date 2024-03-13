package factoryMethod.clase;

public class Durere extends Medicament{
    public Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareMedicament() {
        System.out.printf("%s costa %s lei si este bun pentru durere\n", super.getDenumire(), super.getPret());
    }
}
