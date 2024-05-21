import java.util.HashMap;

public class Banca {
    private String nume;
    private String sucursala;
    private HashMap<String,Flyweight> registru;

    public Banca(String nume, String sucursala) {
        this.nume = nume;
        this.sucursala = sucursala;
        this.registru = new HashMap<>();
    }

    public Flyweight getNume(String nume){
        if(!registru.containsKey(nume)){
            throw new IllegalArgumentException("Clientul nu exista!");
        }
        return registru.get(nume);
    }

    public Flyweight getClient(String nume, String adresa){
        Flyweight c=new Client(nume,adresa);
        if(!registru.containsKey(nume)){
            registru.put(nume,c);
        }
        return registru.get(nume);
    }
}
