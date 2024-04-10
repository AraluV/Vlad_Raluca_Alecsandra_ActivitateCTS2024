package farmacie;

public class Client {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void primireNotificare(String mesaj){
        System.out.println("Clientul "+nume+ "a primit mesajul "+mesaj);
    }
}
