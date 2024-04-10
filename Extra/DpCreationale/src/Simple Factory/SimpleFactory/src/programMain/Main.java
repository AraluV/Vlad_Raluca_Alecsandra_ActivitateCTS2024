package programMain;

import Sportiv.TipSportiv;
import Sportiv.Sportiv;
import Sportiv.SportivFactory;

public class Main {
    public static void main(String[] args) {
        Sportiv sportiv1=SportivFactory.creeazaSportiv(TipSportiv.FUNDAS,"Messi");
        Sportiv sportiv2=SportivFactory.creeazaSportiv(TipSportiv.ATACANT,"Ronaldo");
        sportiv1.afisareDetalii();
        sportiv2.afisareDetalii();
    }
}


