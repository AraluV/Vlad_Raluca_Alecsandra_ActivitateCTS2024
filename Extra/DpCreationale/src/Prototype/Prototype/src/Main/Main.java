package Main;

import clase.Client;

public class Main {
    public static void main(String[] args){
        Client clientInitial=new Client("Bob",17);
        clientInitial.afisareDetalii();

        Client clientClone=(Client) clientInitial.copiere();
        clientClone.setVarsta(32);
        clientClone.afisareDetalii();
    }

}