package FactoryMethod2;

public class Main {
    public static void main(String[] args){
       PersonalSpitalFactory asistentFactory=new AsistentFactory();
       PersonalSpital asistent=asistentFactory.creaza();
       asistent.adauga();
       PersonalSpitalFactory medic=new MedicFactory();
       PersonalSpital med= medic.creaza();
       med.adauga();
    }
}
