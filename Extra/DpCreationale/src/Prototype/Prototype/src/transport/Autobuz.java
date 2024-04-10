package transport;

public class Autobuz implements TransportClone{
    private String marca;
    private int numar;

    @Override
    public TransportClone clone() {
        return new Autobuz(marca,numar);
    }

    public Autobuz(String marca, int numar) {
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

    public void afisareDetalii(){
        System.out.println("Autobuzul "+marca+" are numarul "+numar);
    }
}
