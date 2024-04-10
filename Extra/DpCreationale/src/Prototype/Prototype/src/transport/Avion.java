package transport;

public class Avion implements TransportClone{
    private String marca;
    private int numar;

    public Avion(String marca, int numar) {
        this.marca = marca;
        this.numar = numar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    @Override
    public TransportClone clone() {
        return new Avion(marca,numar);
    }
    public void afisareDetalii(){
        System.out.println("Avionul de marca "+marca+ " are numarul "+numar);
    }

}
