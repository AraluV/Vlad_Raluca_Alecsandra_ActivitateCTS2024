package program;

import banca.Credit;
import banca.CreditIpotecar;
import banca.CreditNevPers;
import banca.CrediteFactory;

public class Main {
    public static void main(String[] args) {
        CrediteFactory modul=new CrediteFactory();
        Credit c1=new CreditNevPers();
        c1.afisareDetalii();
        Credit c2=new CreditIpotecar();
        c2.afisareDetalii();
          }
}