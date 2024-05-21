public class Rezevare{
    private int nrMasa;
    private int nrPersoane;

    public Rezevare(int nrMasa, int nrPersoane) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        return "Rezevare{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                '}';
    }
}
