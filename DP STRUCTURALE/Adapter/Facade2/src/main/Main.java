package main;

import spital.FacadeSpital;
import spital.Medic;
import spital.Pacient;
import spital.Salon;

public class Main {
//    6. Pentru internarea unui pacient în spital trebuie verificată gravitatea stării pacientului prin
//    intermediul clasei Pacient, verificarea confirmării Medicului că trebuie internat, verificarea
//    disponibilității unui pat în cameră prin intermediul clasei Salon care are lista cu paturile libere si
//    ocupate. Spitalul dorește ca personalul spitalului să nu fi nevoit să facă aceste verificări separat ci
//    să fie dezvoltat un modul care să permită această verificarea facilă a acestor lucruri.
    public static void main(String[] args) {
        Medic medic=new Medic("Smith");
        Salon salon=new Salon(1);
        Pacient pacient=new Pacient("Simion","Grava");
        FacadeSpital facade=new FacadeSpital(medic,salon,pacient);
        facade.verificaPatDisponibil();
        facade.verificaPacient();
        facade.verificaConfirmareMedic();
        facade.internarePacient();
    }
}