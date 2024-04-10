package main;

import fabrici.*;

public class Main {
    public static void main(String[] args) {
        FabricaMedicamente fabricaDurere=new FabricaDurere("Paracetamol",25);
        Medicament m1=fabricaDurere.getMedicament();
        System.out.println(m1.afisareDetalii());
        FabricaMedicamente fabricaBody=new FabribaBody("Nivea",30);
        Medicament m2=fabricaBody.getMedicament();
        System.out.println(m2.afisareDetalii());
        FabricaMedicamente fabricaGripa=new FabricaGripa("Parasinus",22);
        Medicament m3=fabricaGripa.getMedicament();
        System.out.println(m3.afisareDetalii());

    }
}