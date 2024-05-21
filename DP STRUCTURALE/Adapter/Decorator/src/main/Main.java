package main;

import bilet.Bilet;
import bilet.DecoratorBilet;

//7. Compania doreste ca modulul de printare al biletelor sa permita cu ocazia anumitor zile nationale
//        sa printeze pe bilet un mesaj de "La multi ani". Se doreste implementarea acestui modul care sa
//        adauge functionalitatea de printare mesaj customizat. Exista posibilitatea ca aceasta functionalitate
//        sa nu fie folosita, si din acest motiv se doreste sa fie optionala, fara modificarea codului existent.
public class Main {
    public static void main(String[] args) {
        Bilet bilet=new Bilet();
        DecoratorBilet decorator=new DecoratorBilet(bilet);
        decorator.printeaza();
    }
}