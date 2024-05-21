import java.io.BufferedReader;

public class Client implements Flyweight{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                '}';
    }

    @Override
    public void afisareDetalii(Rezevare rezervare) {
        final StringBuffer sb=new StringBuffer(this.toString());
        sb.append(rezervare);
        System.out.println(sb);
    }
}
