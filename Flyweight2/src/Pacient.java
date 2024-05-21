public class Pacient implements Flyweight{
    private String nume;
    private String nrTelefon;

    public Pacient(String nume, String nrTelefon) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                '}';
    }

    @Override
    public void afisareInformatii(Internare internare) {
        final StringBuffer sb=new StringBuffer(this.toString());
        sb.append(internare);
        System.out.println(sb);
    }
}
