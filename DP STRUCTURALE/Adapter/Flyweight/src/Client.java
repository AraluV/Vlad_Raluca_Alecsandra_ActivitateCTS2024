public class Client implements Flyweight{
    private String nume;
    private String adresa;

    public Client(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
    @Override
    public void afisareDetalii(Cont cont) {
        final StringBuffer sb=new StringBuffer(this.toString());
        sb.append(cont);
        System.out.println(sb);
    }
}
