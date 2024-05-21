package main;

//9. Deoarece Spitalul este supraaglomerat se impune ca atunci când pacienții doresc internarea să
//        fie internate doar personale care au asigurare de sănătate. Sa se realizeze un nivel intermediar care
//        sa permită internarea doar acestor persoane.

import spital.Internare;
import spital.ProxySpital;
import spital.Spital;

public class Main {
    public static void main(String[] args) {
        Internare spital=new Spital(true);
        Internare proxy=new ProxySpital(spital);
        proxy.interneaza();
        Internare spital1=new Spital(false);
        Internare proxy1=new ProxySpital(spital1);
        proxy1.interneaza();
    }
}