package main;


import sportiv.AtacantFactory;
import sportiv.FundasFactory;
import sportiv.Sportiv;
import sportiv.SportivFactory;

public class Main {
    public static void main(String[] args) {
        SportivFactory fabrica=new AtacantFactory();
        Sportiv sportiv1=fabrica.creeaza();
        sportiv1.afisare();
        SportivFactory fabrica2=new FundasFactory();
        Sportiv sportiv2=fabrica2.creeaza();
        sportiv2.afisare();
    }
}