package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Client implements ClientClone {
    private String nume;
    private int varsta;

    public Client(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public Client clonare() {
        return new Client(nume,varsta);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +"}";
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
