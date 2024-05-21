import java.util.HashMap;

public class Internareactory {
    private HashMap<String,Flyweight> internari;

    public Internareactory() {
        this.internari = new HashMap<>();
    }

    public Flyweight getNume(String nume){
        if(!internari.containsKey(nume)){
            throw new IllegalArgumentException("Pacient inexistent!");
        }
        return internari.get(nume);
    }

    public Flyweight getPacient(String nume,String nrTelefon){
        Flyweight c=new Pacient(nume,nrTelefon);
        if(!internari.containsKey(nume)){
            internari.put(nume,c);
        }
        return internari.get(nume);
    }

}
