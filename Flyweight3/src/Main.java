//10. Pentru fiecare rezervare trebuie să se rețină informații cu privire la clientul restaurantului
//        precum: nume, număr de telefon, adresă de mail, etc, precum și informațiile despre masa rezervata:
//        număr masa, număr persoane, ora rezervare, etc. Astfel, dacă un client realizează mai multe
//        rezervări, la fiecare rezervare, informațiile despre client sunt aceleași și se repetă, ocupând foarte
//        multă memorie. Să se implementeze modulul de memorare al rezervărilor astfel încât să nu ocupe
//        memorie foarte multă.


public class Main {
    public static void main(String[] args) {
        Client client=new Client("Mihai");
        Rezevare rez=new Rezevare(3,6);
        client.afisareDetalii(rez);
    }
}