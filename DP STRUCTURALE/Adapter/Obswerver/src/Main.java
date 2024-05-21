public class Main {
    public static void main(String[] args) {

        Client client=new Client();
        Subject s=new ConcreteObserver();
        s.abonareClient(client);
        s.anuntareMesaj();
        client.primesteMesaj("hhger");

    }
}