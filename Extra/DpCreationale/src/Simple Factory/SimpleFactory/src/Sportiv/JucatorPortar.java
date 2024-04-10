package Sportiv;

public class JucatorPortar extends Sportiv{
    public JucatorPortar(String nume) {
        super(nume);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Sportivul "+getNume()+ " este de tipul PORTAR");
    }


}
