public class Cont {
    private int nrCont;
    private double suma;

    public Cont(int nrCont, double suma) {
        this.nrCont = nrCont;
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "nrCont=" + nrCont +
                ", suma=" + suma +
                '}';
    }
}
