package main;

import bar.Bar;
import bar.PrintareBar;
import bucatarie.AdapterPrintare;
import bucatarie.PrintareBucatarie;

//5. Restaurantul achiziționează un nou soft nou pentru lucrul de la bar, însă acesta nu este compatibil
//        cu softul de printare facturi folosit pentru produsele de la bucătărie. Vechiul soft era compatibil
//        deoarece au fost realizate de aceeași echipa. Să se implementeze un nivel intermediar prin care
//        noul soft să poată fi folosit cu softul existent, fără a se modifica codul din vreo aplicație.
public class Main {
    public static void main(String[] args) {
        Bar bar=new Bar();
        PrintareBucatarie printeaza=new AdapterPrintare(bar);
        printeaza.printeazaBucatarie();
    }
}
