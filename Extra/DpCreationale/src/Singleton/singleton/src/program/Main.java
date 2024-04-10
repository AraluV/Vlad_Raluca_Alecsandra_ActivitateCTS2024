package program;

import restaurant.Customer;

public class Main {
    public static void main(String[] args) {
        // Obținem instanța singleton a clientului
        Customer client1 = Customer.getInstance("John Doe", "john@example.com", "123456789");

        // Clientul revine pentru a face o rezervare
        // Nu este necesară reconstruirea contului său, ci se folosește instanța existentă
        Customer client2 = Customer.getInstance("Mirel", "mirel@example.com", "0768146359");
        Customer client3 = Customer.getInstance("Mirel", "mirel@example.com", "0768146359");

        // Verificăm dacă cele două referințe referă aceeași instanță
        if (client2 == client3) {
            System.out.println("Cont existent!");
        } else {
            System.out.println("Cont inregistrat!");
        }

        // Afișăm informațiile clientului
        client1.afisareInfo();
    }
}