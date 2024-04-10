package Prototype2;

public class Autobuz implements TransportClone{
    private String marca;
    private int numar;

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


    @Override
    public TransportClone clonare() {
        return new Autobuz(marca,numar);
    }

    @Override
    public void afisare() {
        System.out.println("Autobuzul este de marca "+marca+" si are numarul "+numar);
    }
}
