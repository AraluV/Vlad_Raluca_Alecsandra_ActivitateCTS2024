import java.util.HashMap;

public class Banca {
    private HashMap<String,Flyweight> conturi;
    private String nume;

    public Banca(String nume) {
        this.nume = nume;
        this.conturi=new HashMap<>();
    }

    public Flyweight getNume(String nume){
        if(!conturi.containsKey(nume)){
            throw new IllegalArgumentException("Detinator inexistent!");
        }
        return conturi.get(nume);
    }

    public Flyweight getDetinator(String nume){
        Flyweight f=new Detinator(nume);
        if(!conturi.containsKey(nume)){
            conturi.put(nume,f);
        }
        return conturi.get(nume);
    }


}
