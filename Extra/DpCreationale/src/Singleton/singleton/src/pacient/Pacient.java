package pacient;

public class Pacient {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                '}';
    }

    public void primesteNotificare(String mesaj){
        System.out.println("Pacientul "+nume+" a primit notificarea:"+mesaj);
    }
}
