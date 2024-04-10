package Build;

public class Rezervare{
    private boolean decorareMasa;
    private boolean muzica;

    public Rezervare(boolean decorareMasa, boolean muzica) {
        this.decorareMasa = decorareMasa;
        this.muzica = muzica;
    }

    public boolean isDecorareMasa() {
        return decorareMasa;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public boolean isMuzica() {
        return muzica;
    }

    public void setMuzica(boolean muzica) {
        this.muzica = muzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "decorareMasa=" + decorareMasa +
                ", muzica=" + muzica +
                '}';
    }
}
