public class Detinator implements Flyweight{
    private String nume;

    public Detinator(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Detinator{" +
                "nume='" + nume + '\'' +
                '}';
    }

    @Override
    public void afisareDetaliii(Cont cont) {
        final StringBuffer sb=new StringBuffer(this.toString());
        sb.append(cont);
        System.out.println(sb);
    }
}
