package clase;

public class Gripa extends Medicament{
    private int valabilitate;
    public Gripa(String denumire, float pret) {
        super(denumire, pret);
        this.valabilitate = 0;
    }

    public Gripa(String denumire, float pret, int valabilitate) {
        super(denumire, pret);
        this.valabilitate = valabilitate;
    }

    @Override
    public void afisareDetalii() {
        System.out.printf("%s costa %s lei si este bun pentru gripa si este valabil %s zile", super.getDenumire(), super.getPret(), this.valabilitate);
    }
}
