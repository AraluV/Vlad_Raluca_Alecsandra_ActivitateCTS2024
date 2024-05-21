package main;

import platforma.AdapterBilet;
import firma.BiletFirma;
import platforma.EBilet;

//5. Firma de vânzare bilete deține o aplicație pentru rezervarea de bilete și pentru vinderea de bilete
//        la meciuri. Firma dorește să vândă bilete prin intermediul platformei de vânzare bilete: eBilet.ro,
//        însă dezvoltatorii platformei spun că au interfețe pentru obiectele cu care lucrează acea platformă
//        și trebuie creat un nivel intermediar pentru clasele existente în aplicația companiei, astfel încât,
//        platforma să poată lucra cu obiecte furnizate de aplicația existentă.
public class Main {
    public static void main(String[] args) {
        BiletFirma biletFirma=new BiletFirma();
        EBilet bilet=new AdapterBilet(biletFirma);
        bilet.vindeBilet();
    }
}