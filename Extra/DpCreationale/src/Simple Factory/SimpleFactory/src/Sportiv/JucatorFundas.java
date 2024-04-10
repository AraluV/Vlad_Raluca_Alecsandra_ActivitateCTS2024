package Sportiv;

public class JucatorFundas extends Sportiv{
    public JucatorFundas(String nume) {
        super(nume);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Jucatorul "+getNume()+ " este de tip FUNDAS");
    }
}
