public class Internare {
    private int nrPat;
    private int nrSalon;

    public Internare(int nrPat, int nrSalon) {
        this.nrPat = nrPat;
        this.nrSalon = nrSalon;
    }

    @Override
    public String toString() {
        return "Internare{" +
                "nrPat=" + nrPat +
                ", nrSalon=" + nrSalon +
                '}';
    }
}
