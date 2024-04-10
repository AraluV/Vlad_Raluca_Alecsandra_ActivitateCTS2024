package Sportiv;

public class JucatorAtacant extends Sportiv{
    public JucatorAtacant(String nume) {
        super(nume);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul "+getNume()+" este de tip ATACANT");
    }
}
