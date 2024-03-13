package factoryMethod.clase;

public class Raceala extends Medicament{
    private int cantitate;

    public Raceala(String denumire, float pret, int cantitate) {
        super(denumire, pret);
        this.cantitate = cantitate;
    }

    @Override
    public void afisareMedicament() {
        System.out.printf("%s costa %s lei si este bun pentru corp in cantitate de %s\n", super.getDenumire(), super.getPret(), this.cantitate);

    }
}
