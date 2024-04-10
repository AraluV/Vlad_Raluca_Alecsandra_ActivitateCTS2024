package main2;

import farmacie.Client;
import farmacie.Notifficare;

public class Main {
    public static void main(String[] args) {
        Notifficare modul=Notifficare.getInstance();
        Client client1=new Client("Bob");
        Client client2=new Client("Sarma");
        Client client3=new Client("Mugure");

        modul.abonare(client1);
        modul.abonare(client2);
        modul.abonare(client3);
        modul.trimitereNotificare("Cupon reducere!");
        modul.dezabonare(client2);
        modul.trimitereNotificare("Reduceri de primavara!");

    }
}