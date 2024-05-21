package main;

import farmacie.BonDeCasa;
import farmacie.Decorator;

//7. Cu ocazia sărbătorilor de sfârșit de an dirigintele farmaciei dorește ca atunci când este printat
//        bonul de casă să se printeze și o felicitare de La Mulți Ani pentru client. Se dorește adăugarea
//        acestei noi funcționalități pentru clasa BonDeCasa la printare.
public class Main {
    public static void main(String[] args) {
        BonDeCasa bonDeCasa=new BonDeCasa();
        Decorator decorator=new Decorator(bonDeCasa);
        decorator.printeaza();
    }
}