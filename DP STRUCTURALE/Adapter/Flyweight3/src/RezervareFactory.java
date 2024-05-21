import java.util.HashMap;

public class RezervareFactory {
    private HashMap<String,Flyweight> rezervari;

    public RezervareFactory() {
        this.rezervari = new HashMap<>();
    }

    public Flyweight getNume(String nume){
        if(!rezervari.containsKey(nume)){
            throw new IllegalArgumentException("Client inexistent!");
        }
        return rezervari.get(nume);
    }

    public Flyweight getClient(String nume){
        Flyweight f=new Client(nume);
        if(!rezervari.containsKey(nume)){
            this.rezervari.put(nume,f);
        }
        return rezervari.get(nume);
    }
}
