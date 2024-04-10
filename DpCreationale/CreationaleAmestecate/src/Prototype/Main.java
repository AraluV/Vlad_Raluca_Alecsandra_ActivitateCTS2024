package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Client client1=new Client("Sava",33);
        System.out.println(client1);

        Client clientClone=(Client) client1.clonare();
        clientClone.setNume("Marcel");
        System.out.println(clientClone);

    }
}
